package com.android.simpleasynctask19110217;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;
public class AsyncTaskClass extends AsyncTask<Void, Integer, Void> {
    Activity contextParent;

    public AsyncTaskClass(Activity contextParent) {
        this.contextParent = contextParent;
    }
    @Override
    protected Void doInBackground(Void... params) {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(600);
                publishProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        ProgressBar progressBar = (ProgressBar) contextParent.findViewById(R.id.progressBar2);
        int number = values[0];
        progressBar.setProgress(number);
        TextView txt = (TextView) contextParent.findViewById(R.id.txt);
        txt.setText("Napping...");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        TextView txt = (TextView) contextParent.findViewById(R.id.txt);
        txt.setText("Working...");
    }
}
