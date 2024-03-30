package androidx.car.app.messaging.model;

import X.AnonymousClass001;
import X.AnonymousClass0TO;
import X.AnonymousClass0UW;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarMessage {
    public final CarText mBody;
    public final boolean mIsRead = false;
    public final long mReceivedTimeEpochMillis = 0;
    public final Bundle mSender;

    public CarMessage() {
        AnonymousClass0TO r1 = new AnonymousClass0TO();
        r1.A01 = "";
        this.mSender = new AnonymousClass0UW(r1).A01();
        ArrayList A0I = AnonymousClass001.A0I();
        Objects.requireNonNull("");
        this.mBody = new CarText((List) A0I);
    }
}
