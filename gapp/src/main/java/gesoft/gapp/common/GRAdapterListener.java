package gesoft.gapp.common;

import android.view.View;

/**
 * Created by Administrator on 2016/8/4.
 */

public interface GRAdapterListener {

    interface OnConvert<T>{
        void onConvert( GVHolder holder, T item );
    }

    interface OnItemClick<T>{
        void onItemClick( GVHolder holder, T item );
    }

    interface OnItemLongClick<T>{
        void onItemLongClick( GVHolder holder, T item );
    }

}
