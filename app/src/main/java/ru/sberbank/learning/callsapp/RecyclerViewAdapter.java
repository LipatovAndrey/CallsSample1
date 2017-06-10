package ru.sberbank.learning.callsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Date;
import java.util.List;

/**
 * Created by user7 on 10.06.2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<CallViewHolder> {
    private List<Call> mListCalls;
    private Context mContext;
    public RecyclerViewAdapter(List<Call> calls, Context context) {
        this.mListCalls = calls;
        this.mContext = context;
    }
    @Override
    public CallViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_call, parent, false);
        CallViewHolder callViewHolder = new CallViewHolder(view);
        return callViewHolder;
    }

    @Override
    public void onBindViewHolder(CallViewHolder holder, int position) {
            holder.mTelephoneNumber.setText(mListCalls.get(position).number);
           String data = new java.text.SimpleDateFormat("hh:mm").format(new Date(mListCalls.get(position).date));
        String duration =  String.valueOf(mListCalls.get(position).duration/100);
            //holder.mDateOfCall.setText( mContext.getString(R.string.date_formatter, data));
            holder.mDateOfCall.setText(data);
            holder.mDurationofCall.setText(duration);
    }

    @Override
    public int getItemCount() {
        return mListCalls.size();
    }
}
