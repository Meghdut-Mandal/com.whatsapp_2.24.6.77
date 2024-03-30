package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1ck  reason: invalid class name and case insensitive filesystem */
public class C31971ck implements ServiceConnection {
    public final /* synthetic */ ConversationsFragment A00;

    public C31971ck(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A1R = new AnonymousClass29Q(conversationsFragment);
        conversationsFragment.A2u.Boy(new C35691j6(this, 17));
        Log.i("conversations/gdrive-service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ConversationsFragment conversationsFragment = this.A00;
        conversationsFragment.A0n.A02(conversationsFragment.A1R);
        Log.i("conversations/gdrive-service-disconnected");
    }
}
