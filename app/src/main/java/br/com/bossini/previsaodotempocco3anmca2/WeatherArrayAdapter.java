package br.com.bossini.previsaodotempocco3anmca2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rodrigo on 10/31/17.
 */

public class WeatherArrayAdapter extends ArrayAdapter <Weather>{






    private static class ViewHolder{

        ImageView conditionImageView;
        TextView dayTextView;
        TextView lowTextView;
        TextView hiTextView;
        TextView humidityTextView;
    }

    private Map<String, Bitmap> bitmaps = new HashMap<>();
    public WeatherArrayAdapter (Context context, List<Weather> forecast){
        super (context, -1, forecast);
    }
}
