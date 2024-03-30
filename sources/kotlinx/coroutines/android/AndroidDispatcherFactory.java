package kotlinx.coroutines.android;

import X.AnonymousClass03O;
import X.AnonymousClass03P;
import X.AnonymousClass03R;
import android.os.Looper;
import java.util.List;

public final class AndroidDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public AnonymousClass03P createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new AnonymousClass03R(AnonymousClass03O.A00(mainLooper), (String) null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
