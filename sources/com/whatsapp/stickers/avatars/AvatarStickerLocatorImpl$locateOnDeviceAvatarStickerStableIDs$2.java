package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass690;
import X.AnonymousClass6EB;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C111675cf;
import X.C135066c4;
import X.C146226vG;
import X.C23981Ap;
import X.C24201Bn;
import X.C36351kA;
import X.C90504aG;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C24201Bn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(C24201Bn r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A01 = this.this$0.A05.A01(Integer.MAX_VALUE, 2);
            C24201Bn r5 = this.this$0;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C23981Ap r1 = r5.A02;
                C135066c4 A00 = C111675cf.A00(r5.A01, r1, (AnonymousClass6EB) it.next());
                if (A00 != null) {
                    A0I.add(A00);
                }
            }
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                String str = C90504aG.A0U(it2).A06;
                if (str != null) {
                    A0I2.add(str);
                }
            }
            ArrayList A0z = C36351kA.A0z(A0I2);
            Iterator it3 = A0I2.iterator();
            while (it3.hasNext()) {
                A0z.add(new AnonymousClass690(AnonymousClass001.A0C(it3)));
            }
            ArrayList A012 = this.this$0.A04.A01();
            ArrayList A0I3 = AnonymousClass001.A0I();
            Iterator it4 = A012.iterator();
            while (it4.hasNext()) {
                String str2 = ((C146226vG) it4.next()).A01.A04.A06;
                if (str2 != null) {
                    A0I3.add(str2);
                }
            }
            ArrayList A0z2 = C36351kA.A0z(A0I3);
            Iterator it5 = A0I3.iterator();
            while (it5.hasNext()) {
                A0z2.add(new AnonymousClass690(AnonymousClass001.A0C(it5)));
            }
            return C007103b.A0f(C007103b.A0S(A0z2, A0z));
        }
        throw AnonymousClass000.A0e();
    }
}
