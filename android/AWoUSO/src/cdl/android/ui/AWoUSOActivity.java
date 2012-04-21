package cdl.android.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import cdl.android.R;
import cdl.android.server.ApiRequests;

public class AWoUSOActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        ApiRequests req = new ApiRequests();
        req.getUserInfo();
    }
}