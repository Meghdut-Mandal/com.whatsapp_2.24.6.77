package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass1RY;
import X.AnonymousClass2bT;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C36321k7;
import X.C36341k9;
import X.C38801q7;
import X.C48902iF;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventNameAndDescriptionView$setUpGroupInfoSection$1", f = "EventNameAndDescriptionView.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class EventNameAndDescriptionView$setUpGroupInfoSection$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass1RY $contactPhotoLoader;
    public final /* synthetic */ AnonymousClass2bT $message;
    public int label;
    public final /* synthetic */ C38801q7 this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventNameAndDescriptionView$setUpGroupInfoSection$1$1", f = "EventNameAndDescriptionView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventNameAndDescriptionView$setUpGroupInfoSection$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r9) {
            C38801q7 r4 = r8;
            return new AnonymousClass1(r5, A0D, r7, r4, A0J, r9);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                r8.A08.A03(0);
                TextView A0M = C36341k9.A0M(r8.A08.A01(), R.id.event_info_group_name);
                ImageView A0L = C36341k9.A0L(r8.A08.A01(), R.id.event_info_group_photo);
                ImageView A0L2 = C36341k9.A0L(r8.A08.A01(), R.id.event_info_group_chevron);
                r5.A08(A0L, A0D);
                A0M.setText(A0J);
                C48902iF.A00(r8.A08.A01(), r7, r8, 6);
                C36321k7.A0L(r8.getContext(), A0L2, r8.getWhatsAppLocale(), R.drawable.chevron_right_wds);
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventNameAndDescriptionView$setUpGroupInfoSection$1(AnonymousClass1RY r2, AnonymousClass2bT r3, C38801q7 r4, C023509x r5) {
        super(2, r5);
        this.$message = r3;
        this.this$0 = r4;
        this.$contactPhotoLoader = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EventNameAndDescriptionView$setUpGroupInfoSection$1(this.$contactPhotoLoader, this.$message, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass11F r1 = this.$message.A1J.A00;
            if (r1 != null) {
                final AnonymousClass141 A0D = this.this$0.getContactManager().A0D(r1);
                final String A0J = A0D.A0J();
                C005502l mainDispatcher = this.this$0.getMainDispatcher();
                final C38801q7 r8 = this.this$0;
                final AnonymousClass1RY r5 = this.$contactPhotoLoader;
                final AnonymousClass2bT r7 = this.$message;
                AnonymousClass1 r4 = new AnonymousClass1((C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, mainDispatcher, r4) == r2) {
                    return r2;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventNameAndDescriptionView$setUpGroupInfoSection$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
