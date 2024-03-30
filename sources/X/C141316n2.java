package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.6n2  reason: invalid class name and case insensitive filesystem */
public class C141316n2 implements C159107ip {
    public MediaFormat A00;
    public C141206mq A01 = null;
    public ArrayList A02;
    public CountDownLatch A03 = new CountDownLatch(1);
    public LinkedBlockingQueue A04;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();
    public volatile boolean A07;
    public volatile boolean A08 = true;

    public C160917ln B4S() {
        this.A04 = new LinkedBlockingQueue();
        return new C141276mx(this);
    }

    public C161017ly B4U() {
        return new C141296mz(this);
    }
}
