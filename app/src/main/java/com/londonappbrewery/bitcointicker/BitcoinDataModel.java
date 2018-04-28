package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class BitcoinDataModel {

    private String mBid;
    private String mAsk;
    private String mLast;
    private String mHigh;
    private String mLow;
    private Date mDisplayTimestamp;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){

        try{
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();

            bitcoinDataModel.mAsk = jsonObject.getString("ask");
            bitcoinDataModel.mLast = jsonObject.getString("last");

            return bitcoinDataModel;

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }

    }

    public String getAsk() {
        return mAsk;
    }

    public void setAsk(String ask) {
        mAsk = ask;
    }

    public String getLast() {
        return mLast;
    }

    public void setLast(String last) {
        mLast = last;
    }
}
