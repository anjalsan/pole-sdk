package beacon_sdk.poletalks.com.pole_sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by anjal on 10/28/17.
 */

public class PoleView extends LinearLayout {

    public PoleView(Context context) {
        super(context);
        initialize(context);
    }

    public PoleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }

}