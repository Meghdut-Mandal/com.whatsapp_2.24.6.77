package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass03N;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass1HC;
import X.AnonymousClass5TK;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C105855Hf;
import X.C105865Hg;
import X.C106015Ia;
import X.C111345c8;
import X.C111355c9;
import X.C111365cA;
import X.C120115qz;
import X.C123815x8;
import X.C132076Sa;
import X.C134846bh;
import X.C146026uu;
import X.C147546xO;
import X.C23871Ae;
import X.C24241Br;
import X.C24261Bt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C90524aI;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackAwait$2", f = "AvatarStickersRepository.kt", i = {0, 0}, l = {147}, m = "invokeSuspend", n = {"avatarSharedPreferences", "currentRevision"}, s = {"L$2", "L$3"})
public final class AvatarStickersRepository$fetchAvatarStickerPackAwait$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ List $socialStickerUserIds;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackAwait$2(C24241Br r2, Integer num, Integer num2, List list, Set set, C023509x r7, boolean z) {
        super(2, r7);
        this.$qplInstanceKey = num;
        this.this$0 = r2;
        this.$stickerPackDownloadOrigin = num2;
        this.$stableIds = set;
        this.$defaultPack = z;
        this.$socialStickerUserIds = list;
    }

    public final C023509x create(Object obj, C023509x r10) {
        Integer num = this.$qplInstanceKey;
        AvatarStickersRepository$fetchAvatarStickerPackAwait$2 avatarStickersRepository$fetchAvatarStickerPackAwait$2 = new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(this.this$0, num, this.$stickerPackDownloadOrigin, this.$socialStickerUserIds, this.$stableIds, r10, this.$defaultPack);
        avatarStickersRepository$fetchAvatarStickerPackAwait$2.L$0 = obj;
        return avatarStickersRepository$fetchAvatarStickerPackAwait$2;
    }

    public final Object invokeSuspend(Object obj) {
        Number number;
        C24241Br r11;
        C24261Bt r3;
        Object obj2;
        C111345c8 r1;
        String str;
        AnonymousClass5TK r19;
        Object obj3 = obj;
        AnonymousClass0AO r8 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj3);
            number = this.$qplInstanceKey;
            r11 = this.this$0;
            Integer num = this.$stickerPackDownloadOrigin;
            Set set = this.$stableIds;
            boolean z = this.$defaultPack;
            List list = this.$socialStickerUserIds;
            boolean z2 = false;
            if (number != null) {
                try {
                    ((AnonymousClass1HC) r11.A05.get()).A01.markerAnnotate(354170068, number.intValue(), C106015Ia.A00.A00, AnonymousClass000.A1P(z ? 1 : 0));
                } catch (Throwable th) {
                    AnonymousClass03N A0t = C90524aI.A0t(th);
                    C24241Br r12 = this.this$0;
                    Throwable th2 = A0t.exception;
                    if (th2 == null) {
                        return A0t;
                    }
                    Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/unable to fetch sticker pack", th2);
                    C23871Ae r2 = r12.A02;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("unhandled error (");
                    r2.A02(1, "fetch_avatar_sticker_pack_failed", C36321k7.A0E(th2.getMessage(), A0u));
                    return null;
                }
            }
            C120115qz r7 = (C120115qz) r11.A07.get();
            r3 = (C24261Bt) r11.A06.get();
            Object A01 = r3.A01();
            if (num == null || num.intValue() != 7) {
                r19 = AnonymousClass5TK.INITIAL_DOWNLOAD;
            } else {
                r19 = AnonymousClass5TK.ART_UPDATE;
            }
            if (z) {
                z2 = true;
            }
            C36331k8.A1G(set, 0, list);
            C146026uu B3y = r7.A01.B3y(new C147546xO(r7, r19, A01, list, set, z2));
            this.L$0 = number;
            this.L$1 = r11;
            this.L$2 = r3;
            this.L$3 = A01;
            this.label = 1;
            obj3 = GraphqlRequest$postAwait$2.A01(B3y, this, AnonymousClass19R.A01);
            obj2 = A01;
            if (obj3 == r8) {
                return r8;
            }
        } else if (i == 1) {
            Object obj4 = this.L$3;
            r3 = (C24261Bt) this.L$2;
            r11 = (C24241Br) this.L$1;
            number = (Number) this.L$0;
            AnonymousClass0AN.A00(obj3);
            obj2 = obj4;
        } else {
            throw AnonymousClass000.A0e();
        }
        C123815x8 r72 = (C123815x8) obj3;
        C111355c9 A00 = C111365cA.A00(r72);
        if (A00 instanceof C105855Hf) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("AvatarStickersRepository/fetchAvatarStickerPackAwait/");
            Object obj5 = ((C105855Hf) A00).A00;
            C36331k8.A1P(obj5, A0u2);
            C23871Ae r32 = r11.A02;
            if (obj5 instanceof C111345c8) {
                r1 = (C111345c8) obj5;
            } else {
                r1 = null;
            }
            if (r1 == null || (str = C24241Br.A00(r1)) == null) {
                str = "no data";
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Unable to identify error for GraphQL result, code: ");
                A0u3.append(r72.A00);
                A0u3.append(", raw: ");
                C36331k8.A1P(r72.A05, A0u3);
            }
            r32.A02(1, "fetch_avatar_sticker_pack_failed", str);
            return null;
        } else if (A00 instanceof C105865Hg) {
            C134846bh r15 = (C134846bh) ((C105865Hg) A00).A00;
            if (r15 == null) {
                return null;
            }
            List list2 = r15.A09;
            if (obj2 == null) {
                C36341k9.A0x(C36351kA.A0A(r3.A01), "pref_avatar_art_pending_revision", r15.A01);
            }
            if (list2.isEmpty()) {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/received empty stickers list");
                r11.A02.A02(1, "fetch_avatar_sticker_pack_failed", "received empty stickers");
                return null;
            }
            if (number != null) {
                ((AnonymousClass1HC) r11.A05.get()).A01(number.intValue(), "avatar_stickerpack_generated");
            }
            AnonymousClass68B A02 = ((C132076Sa) r11.A08.get()).A02(r15.A00, r15.A04, r15.A05, r15.A02, r15.A06, r15.A08, r15.A07, r15.A03, list2);
            if (number != null) {
                ((AnonymousClass1HC) r11.A05.get()).A01(number.intValue(), "avatar_stickerpack_mapped");
            }
            return A02;
        } else {
            throw C36441kJ.A18();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarStickerPackAwait$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
