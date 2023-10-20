package com.gutib.activity3gutib

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gutib.activity3gutib.databinding.LayoutRowsBinding

class RecyAdapter(private val ListofItems: List<MyModel>, private val onItemClick: (MyModel) -> Unit) :
    RecyclerView.Adapter<RecyAdapter.ViewHolder>() {

    data class MyModel(val name: String, val subject: String, val body: String)

    inner class ViewHolder(private val binding: LayoutRowsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyModel) {
            with(binding) {
                nameLay.text = item.name
                subLay.text = item.subject
                bodyLay.text = item.body
            }
            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LayoutRowsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ListofItems[position])
    }

    override fun getItemCount(): Int {
        return ListofItems.size
    }
}
