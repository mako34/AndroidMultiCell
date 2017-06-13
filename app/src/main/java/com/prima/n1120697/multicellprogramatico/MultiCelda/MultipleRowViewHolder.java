package com.prima.n1120697.multicellprogramatico.MultiCelda;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.prima.n1120697.multicellprogramatico.R;

/**
 * Created by n1120697 on 13/6/17.
 */

public class MultipleRowViewHolder extends RecyclerView.ViewHolder {

    public TextView multipleContent;

    private int type;

    public MultipleRowViewHolder(View itemView, int type) {
        super(itemView);

//        if (type == AppConstant.FIRST_ROW){
//            multipleContent = (TextView)itemView.findViewById(R.id.row_first_name_tv);
//        }else if(type == AppConstant.OTHER_ROW) {
//            multipleContent = (TextView)itemView.findViewById(R.id.row_other_name_tv);
//        }

        if (type == 0){
            multipleContent = (TextView)itemView.findViewById(R.id.row_first_name_tv);
        }else {
            multipleContent = (TextView)itemView.findViewById(R.id.row_other_name_tv);
        }
    }
}