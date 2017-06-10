package ru.sberbank.learning.callsapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Тичер on 10.06.2017.
 */
public class CallViewHolder extends RecyclerView.ViewHolder {
    public TextView mTelephoneNumber, mDateOfCall, mDurationofCall;

    public CallViewHolder(View itemView) {
        super(itemView);
        mTelephoneNumber = (TextView) itemView.findViewById(R.id.telephonNumber);
        mDateOfCall = (TextView) itemView.findViewById(R.id.callDate);
        mDurationofCall = (TextView) itemView.findViewById(R.id.callDuration);
    }

    public void bindView(Call call) {

    }
}
