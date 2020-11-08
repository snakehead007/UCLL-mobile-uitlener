package be.ucll.java.mobile.ucllnotes.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import be.ucll.java.mobile.ucllnotes.R;

public class RVItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView txtRVTitle;
    private RVItemClick RVItemClick;

    // Constructor
    public RVItemHolder(View itemView, RVItemClick RVItemClick) {
        super(itemView);

        txtRVTitle = itemView.findViewById(R.id.txtRVItem);
        this.RVItemClick = RVItemClick;

        itemView.setOnClickListener(this);
    }

    // Het afhandelen van de onClick gebeurt door het NoteListFragment omdat er vandaar
    // naar een ander fragment genavigeerd moet worden.
    @Override
    public void onClick(View view) {
        RVItemClick.onRVNoteClick(getAdapterPosition());
    }

    public TextView getTxtRVTitle() {
        return txtRVTitle;
    }
}