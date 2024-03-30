package X;

import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Constructor;

public class B91 implements B4V {
    public Object A00;
    public Object A01;
    public final int A02;

    public B91(C195979Xa r1, C199119ej r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }

    public B2h[] B4X() {
        B2h[] b2hArr;
        C209159zY r0;
        B2h[] b2hArr2;
        B2h r02;
        if (this.A02 != 0) {
            if (1 == ((C195979Xa) this.A01).A01) {
                b2hArr2 = new B2h[3];
                b2hArr2[0] = new C209069zP();
                b2hArr2[1] = new C209159zY(0);
                r02 = new C209079zQ();
            } else if (((C199119ej) this.A00).A07.shouldAddDefaultMP4Extractor) {
                b2hArr2 = new B2h[3];
                b2hArr2[0] = new C209159zY(0);
                b2hArr2[1] = new C209079zQ();
                r02 = new C209069zP();
            } else {
                return new B2h[]{new C209159zY(0)};
            }
            b2hArr2[2] = r02;
            return b2hArr2;
        }
        try {
            Constructor<?> constructor = Class.forName("com.facebook.android.exoplayer2.extractor.mp3.Mp3Extractor").getConstructor(new Class[0]);
            if (((C199119ej) this.A00).A07.enableMp3Mp4ExtractorLogic) {
                C207239um r1 = ((C195979Xa) this.A01).A0F;
                Uri uri = r1.A05;
                if (uri == null || uri.getLastPathSegment() == null || !r1.A05.getLastPathSegment().endsWith(".mp3")) {
                    b2hArr = new B2h[2];
                    b2hArr[0] = (B2h) constructor.newInstance(new Object[0]);
                    r0 = new C209159zY(0);
                } else {
                    return new B2h[]{(B2h) constructor.newInstance(new Object[0])};
                }
            } else {
                String str = ((C195979Xa) this.A01).A0F.A0G;
                if (str == null || !str.equals("undefined")) {
                    return new B2h[]{(B2h) constructor.newInstance(new Object[0])};
                }
                b2hArr = new B2h[2];
                b2hArr[0] = (B2h) constructor.newInstance(new Object[0]);
                r0 = new C209159zY(0);
            }
            b2hArr[1] = r0;
            return b2hArr;
        } catch (Exception e) {
            Log.e("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
            throw AnonymousClass001.A0B(e);
        }
    }
}
