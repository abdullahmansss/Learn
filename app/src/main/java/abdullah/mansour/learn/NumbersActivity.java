package abdullah.mansour.learn;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import abdullah.mansour.learn.Models.NumberModel;

public class NumbersActivity extends AppCompatActivity
{
    List<NumberModel> list;
    ListView listView;

    NumbersAdapter numbersAdapter;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        listView = findViewById(R.id.listview);

        list = new ArrayList<>();

        list.add(new NumberModel("One", "واحد" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Two", "اثنين" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Three", "ثلاثه" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Four", "أربعه" , R.drawable.ic_one, R.raw.notification));

        list.add(new NumberModel("One", "واحد" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Two", "اثنين" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Three", "ثلاثه" , R.drawable.ic_one, R.raw.notification));
        list.add(new NumberModel("Four", "أربعه" , R.drawable.ic_one, R.raw.notification));

        numbersAdapter = new NumbersAdapter(getApplicationContext(), 0, list);
        listView.setAdapter(numbersAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                NumberModel numberModel = numbersAdapter.getItem(position);

                mediaPlayer = MediaPlayer.create(getApplicationContext(), numberModel.getNumber_sound());
                mediaPlayer.start();
            }
        });
    }
}
