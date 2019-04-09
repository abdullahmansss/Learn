package abdullah.mansour.learn;

import android.content.Context;
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
    TextView number_e,number_a;
    ImageView number_image;

    public NumbersAdapter(Context context, int resource, List<NumberModel> numberModelList)
    {
        super(context, resource, numberModelList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.number_item, parent, false);
        }

        NumberModel numberModel = getItem(position);

        number_e = convertView.findViewById(R.id.number_e);
        number_a = convertView.findViewById(R.id.number_a);
        number_image = convertView.findViewById(R.id.number_image);

        number_e.setText(numberModel.getNumber_a());
        number_a.setText(numberModel.getNumber_e());

        number_image.setImageResource(numberModel.getNumber_image());

        return convertView;
    }
}
