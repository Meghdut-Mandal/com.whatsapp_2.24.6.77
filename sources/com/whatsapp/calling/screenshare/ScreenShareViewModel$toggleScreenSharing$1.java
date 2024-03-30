package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C108075Sb;
import X.C108345Td;
import X.C36441kJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$toggleScreenSharing$1", f = "ScreenShareViewModel.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$toggleScreenSharing$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C108075Sb $entryPoint;
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$toggleScreenSharing$1(C108075Sb r2, ScreenShareViewModel screenShareViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = screenShareViewModel;
        this.$entryPoint = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ScreenShareViewModel$toggleScreenSharing$1(this.$entryPoint, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C108345Td r0;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ScreenShareViewModel screenShareViewModel = this.this$0;
            int ordinal = this.$entryPoint.ordinal();
            if (ordinal == 0) {
                r0 = C108345Td.STOP_FROM_BOTTOM_SHEET;
            } else if (ordinal == 1) {
                r0 = C108345Td.STOP_FROM_GRID_TILE;
            } else if (ordinal == 2) {
                r0 = C108345Td.DISPLAY_PENDING_CALL;
            } else if (ordinal == 3) {
                r0 = C108345Td.CALL_ENDED;
            } else {
                throw C36441kJ.A18();
            }
            this.label = 1;
            if (ScreenShareViewModel.A06(r0, screenShareViewModel, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenShareViewModel$toggleScreenSharing$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
