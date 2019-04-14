package abdullah.mansour.learn;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import abdullah.mansour.learn.Models.NumberModel;

public class NumbersAdapter extends ArrayAdapter<NumberModel>
{
    TextView name_e,name_a;
    ImageView imageView;

    List<NumberModel> list;

    public NumbersAdapter(Context context, int resource, List<NumberModel> numberModels)
    {
        super(context, resource, numberModels);
        this.list = numberModels;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.number_item, parent, false);
        }

        NumberModel numberModel = list.get(position);

        name_e = convertView.findViewById(R.id.number_e);
        name_a = convertView.findViewById(R.id.number_a);
        imageView = convertView.findViewById(R.id.number_image);

        name_e.setText(numberModel.getNumber_e());
        name_a.setText(numberModel.getNumber_a());
        imageView.setImageResource(numberModel.getNumber_image());

        return convertView;
    }
}
