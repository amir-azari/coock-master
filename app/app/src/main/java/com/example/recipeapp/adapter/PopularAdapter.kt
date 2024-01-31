package com.example.recipeapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.EventListener
import coil.load
import coil.request.CachePolicy
import com.example.recipeapp.R
import com.example.recipeapp.databinding.ItemPopularBinding
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.models.recipe.ResponseRecipes.Result
import com.example.recipeapp.utils.BaseDiffUtils
import com.example.recipeapp.utils.Constants
import javax.inject.Inject

class PopularAdapter @Inject constructor(): RecyclerView.Adapter<PopularAdapter.ViewHolder>(){
    //Binding
    private lateinit var binding : ItemPopularBinding

    //other
    private var popularItem = emptyList<Result>()
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        binding = ItemPopularBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(popularItem[position])


    }

    override fun getItemCount(): Int {
        return popularItem.size
    }



    override fun getItemViewType(position: Int) = position

    override fun getItemId(position: Int) = position.toLong()

    inner class ViewHolder() : RecyclerView.ViewHolder(binding.root){

        @SuppressLint("SetTextI18n")
        fun bind(item : Result){
            binding.apply {
                //text
                popularNameTxt.text = item.title
                popularPriceTxt.text = "${item.pricePerServing} $"
                //Image
                val imageSplit = item.image!!.split("-")
                val imageSize = imageSplit[1].replace(Constants.OLD_IMAGE_SIZE,Constants.NEW_IMAGE_SIZE)
                popularImg.load("${imageSplit[0]}-${imageSize}"){
                    crossfade(true)
                    crossfade(800)
                    memoryCachePolicy(CachePolicy.ENABLED)
                    error(R.drawable.ic_placeholder)
                }

                //Click
                root.setOnClickListener {
                    onItemClickListener?.let {
                        item.id?.let { it1 -> it(it1) }
                    }
                }

            }
        }

    }

    private var onItemClickListener:((Int) -> Unit)? = null

    fun setOnItemClickListener(listener:((Int)-> Unit)){
        onItemClickListener = listener
    }

    fun setData(data: List<Result>) {
        val adapterDiffUtils = BaseDiffUtils(popularItem , data)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        popularItem = data
        diffUtils.dispatchUpdatesTo(this)
    }

}