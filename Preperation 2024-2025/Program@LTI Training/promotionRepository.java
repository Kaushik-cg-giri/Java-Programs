package com.example.newproject;

import android.app.Application;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PromotionRepository {

    private PromotionDAO prmDao;
    private List<PromotionTable> allData;

    public PromotionRepository(Application application) {

        PromotionDatabase db = PromotionDatabase.getDatabase(application);
        prmDao = db.promotionDAO();
        allData = prmDao.getDetails();

    }

    public List<PromotionTable> getAllData() {
        return allData;
    }


    public void insertData(PromotionTable data) {
        new PromotionInseration(prmDao).execute(data);
    }

    private static class PromotionInseration extends AsyncTask<PromotionTable, Void, Void> {

        private PromotionDAO prmDao;

        private PromotionInseration(PromotionDAO prmDao) {

            this.prmDao = prmDao;

        }

        @Override
        protected Void doInBackground(PromotionTable... data) {

            prmDao.insertDetails(data[0]);
            return null;

        }
    }
}

