package androidx.car.app.media;

import X.AnonymousClass001;
import X.C22739AvA;
import androidx.car.app.media.ICarAudioCallback;
import java.util.Objects;

public class CarAudioCallbackDelegate {
    public final ICarAudioCallback mCallback = null;

    public class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        public final C22739AvA mCarAudioCallback;

        public void onStopRecording() {
            Objects.requireNonNull((Object) null);
            throw AnonymousClass001.A0A("onStopRecording");
        }

        public CarAudioCallbackStub(C22739AvA avA) {
            this.mCarAudioCallback = avA;
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }
}
