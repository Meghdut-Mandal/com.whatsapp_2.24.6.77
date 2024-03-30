package com.whatsapp.contact.picker.invite.compose.perf.scroll;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1JI;
import X.AnonymousClass34D;
import X.AnonymousClass7L2;
import X.C009003v;
import X.C023509x;
import X.C06820Vf;
import X.C07430Xq;
import X.C14300lP;
import X.C14660lz;
import X.C15330nA;
import X.C157307ck;
import X.C18500tG;
import X.C18510tH;
import android.app.Activity;
import android.view.Window;
import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DropFrameWatcherKt$DropFrameWatcher$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C157307ck $state;
    public final /* synthetic */ AnonymousClass34D $watcher;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$2", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$2  reason: invalid class name */
    public final class AnonymousClass2 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ boolean Z$0;
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            AnonymousClass2 r1 = new AnonymousClass2(activity, r1, r5);
            r1.Z$0 = AnonymousClass000.A1X(obj);
            return r1;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                boolean z = this.Z$0;
                AnonymousClass34D r4 = r1;
                boolean z2 = !z;
                Window window = activity.getWindow();
                AnonymousClass00C.A08(window);
                AnonymousClass1JI r1 = r4.A01;
                if (z2) {
                    r1.A02(window);
                } else {
                    r1.A03(window, r4.A00);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropFrameWatcherKt$DropFrameWatcher$3(Activity activity, C157307ck r3, AnonymousClass34D r4, C023509x r5) {
        super(2, r5);
        this.$state = r3;
        this.$watcher = r4;
        this.$activity = activity;
    }

    public final C023509x create(Object obj, C023509x r6) {
        DropFrameWatcherKt$DropFrameWatcher$3 dropFrameWatcherKt$DropFrameWatcher$3 = new DropFrameWatcherKt$DropFrameWatcher$3(this.$activity, this.$state, this.$watcher, r6);
        dropFrameWatcherKt$DropFrameWatcher$3.L$0 = obj;
        return dropFrameWatcherKt$DropFrameWatcher$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H A01 = C07430Xq.A01(new C18500tG(new C14300lP((C023509x) null, new C14660lz(), new C15330nA(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1((C023509x) null, new AnonymousClass7L2(this.$state)))), 3));
            final AnonymousClass34D r1 = this.$watcher;
            final Activity activity = this.$activity;
            C06820Vf.A01((AnonymousClass040) this.L$0, new C18510tH((C009003v) new AnonymousClass2((C023509x) null), A01, 5));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DropFrameWatcherKt$DropFrameWatcher$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
