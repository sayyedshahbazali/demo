package com.example.sayyed.calenderwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppWidgetProvider {
    Handler handler;
Context context;
    TextView fact;
    LinearLayout layoutOfPopup; PopupWindow popupMessage; Button popupButton, insidePopupButton; TextView popupText;


    @Override
    public void onReceive(Context context, Intent intent) {
        handler=new Handler();

        super.onReceive(context, intent);
    }


    public void onUpdate(Context context, AppWidgetManager appWidgetManager,int[] appWidgetIds) {

        for(int i=0; i<appWidgetIds.length; i++){
            int currentWidgetId = appWidgetIds[i];
            String url = "http://www.tutorialspoint.com";
            RemoteViews views = new RemoteViews(context.getPackageName(),R.layout.activity_main);
            Intent intentcalender=new Intent(context,CalenderActivity.class);
            intentcalender.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PendingIntent pending = PendingIntent.getActivity(context, 0,intentcalender, 0);
            views.setOnClickPendingIntent(R.id.button, pending);
            views.setOnClickPendingIntent(R.id.viewfact, pending);

          //  context.startActivity(intentcalender);


           /* Intent intent = new Intent(context.C);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);*/

//            intent.setData(Uri.parse(url));*/
          //  int color= Color.TRANSPARENT;





          //  marqueText();
            /*Bitmap bitmap = ((BitmapDrawable)context.getResources().getDrawable(R.drawable.background)).getBitmap();
            views.setBitmap(R.id.image, "setBackgroundDrawable",bitmap );*/



            appWidgetManager.updateAppWidget(currentWidgetId, views);
           // views.setInt(R.id.layout, "setBackgroundColor", color);
            Toast.makeText(context, "widget added", Toast.LENGTH_SHORT).show();
        }
   }

    void marqueText(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                while(true) {

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            Log.i("sdas", "d");
;                        }
                    });


                }


            }
        }).start();

    }



    }

