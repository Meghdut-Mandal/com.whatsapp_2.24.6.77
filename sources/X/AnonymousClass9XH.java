package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.9XH  reason: invalid class name */
public class AnonymousClass9XH {
    public int A00 = 0;
    public AnonymousClass9W3 A01 = new AnonymousClass9W3(0, 0);
    public boolean A02;
    public final AnonymousClass9VB A03 = new AnonymousClass9VB();
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final HashMap A05 = AnonymousClass001.A0J();
    public final Camera.PreviewCallback A06 = new BAI(this, 0);
    public final Camera.PreviewCallback A07 = new BAI(this, 1);

    public synchronized void A00() {
        synchronized (this) {
            this.A03.A00();
            this.A05.clear();
            this.A04.clear();
        }
    }

    public synchronized void A01(Camera camera) {
        if (!C202399lk.A02()) {
            camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            this.A02 = false;
        } else {
            throw C90514aH.A0s("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, AnonymousClass9W3 r13, int i) {
        RuntimeException th;
        int i2;
        synchronized (this) {
            if (C202399lk.A02()) {
                th = C90514aH.A0s("Cannot enable listeners on the UI thread");
                throw th;
            } else if (!this.A02) {
                this.A00 = i;
                if (r13 == null) {
                    r13 = new AnonymousClass9W3(0, 0);
                }
                this.A01 = r13;
                Objects.requireNonNull(camera);
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback((Camera.PreviewCallback) null);
                    AnonymousClass9W3 r7 = this.A01;
                    try {
                        Iterator A10 = C36391kE.A10(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A10.hasNext()) {
                            int A0H = C90514aH.A0H(A10.next());
                            if (A0H > i4) {
                                i4 = A0H;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * r7.A02 * r7.A01;
                            if (i2 % 8 != 0) {
                                throw AnonymousClass001.A09("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int ceil = ((int) Math.ceil(((double) r7.A02) / 16.0d)) * 16;
                            int ceil2 = ((int) Math.ceil(((double) (ceil / 2)) / 16.0d)) * 16;
                            int i5 = r7.A01;
                            i2 = (ceil * i5) + (((ceil2 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A04;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList A14 = C36441kJ.A14(i4);
                                while (i3 < i4) {
                                    A14.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A14);
                            }
                        } else {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A07);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallback(this.A06);
                }
                this.A02 = true;
            }
        }
    }
}
