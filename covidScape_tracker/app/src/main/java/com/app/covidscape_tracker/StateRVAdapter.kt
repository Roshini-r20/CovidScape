package com.app.covidscape_tracker
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class StateRVAdapter (private val stateList:List<StateModel>) : RecyclerView.Adapter<StateRVAdapter.StateRVViewHolder>() {
    class StateRVViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val stateNameTV:TextView = itemView.findViewById((R.id.idTVState))
        val deathsTV:TextView = itemView.findViewById(R.id.idTVDeaths)
        val casesTV:TextView = itemView.findViewById(R.id.idTVCases)
        val recoveredTV:TextView = itemView.findViewById(R.id.idTVRecord)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRVViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.state_model,parent,false)
        return StateRVViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return stateList.size
    }

    override fun onBindViewHolder(holder: StateRVViewHolder, position: Int) {
        val statedata = stateList[position]
        holder.casesTV.text = statedata.cases.toString()
        holder.stateNameTV.text = statedata.state
        holder.deathsTV.text= statedata.deaths.toString()
        holder.recoveredTV.text = statedata.recovered.toString()
    }

}