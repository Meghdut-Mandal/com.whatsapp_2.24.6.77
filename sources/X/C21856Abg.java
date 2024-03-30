package X;

import com.facebook.wamediajni.WamediaStreamsMP4Muxer;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.Abg  reason: case insensitive filesystem */
public class C21856Abg extends PhantomReference {
    public final WamediaStreamsMP4Muxer.NativeWrapper A00;

    public C21856Abg(WamediaStreamsMP4Muxer.NativeWrapper nativeWrapper, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.A00 = nativeWrapper;
    }
}
