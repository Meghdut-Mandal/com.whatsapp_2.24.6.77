package com.whatsapp.messaging;

import X.AnonymousClass012;
import X.AnonymousClass1A1;
import X.AnonymousClass1LX;
import X.AnonymousClass3HC;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass4TX;
import X.C001600r;
import X.C595134f;
import X.C64933Qa;
import X.C89004Uw;
import X.C89014Ux;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BaseViewOnceMessageViewerFragment extends Hilt_BaseViewOnceMessageViewerFragment implements C89004Uw {
    public AnonymousClass3HC A00;
    public AnonymousClass1LX A01;
    public AnonymousClass3T1 A02;
    public AnonymousClass1A1 A03;

    public /* synthetic */ void B0z(Drawable drawable, View view) {
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void B7Q() {
    }

    public /* synthetic */ void B7f(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public /* synthetic */ void BpV(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BrT(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BsB(List list, boolean z) {
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public void Bu3(View view, AnonymousClass3T1 r2, int i, boolean z) {
    }

    public /* synthetic */ void Bur(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bwy(AnonymousClass3T1 r1) {
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A00.A09;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C64933Qa A04 = AnonymousClass3UJ.A04(this);
        Objects.requireNonNull(A04);
        Objects.requireNonNull(A04);
        AnonymousClass3T1 A032 = this.A03.A03(A04);
        Objects.requireNonNull(A032);
        this.A02 = A032;
        ViewOnceNuxBottomSheet.A06(A0l(), (C595134f) null, this.A01, (AnonymousClass3T1) ((AnonymousClass4TX) A032));
    }

    public /* synthetic */ boolean BK6() {
        return false;
    }

    public /* synthetic */ boolean BMS() {
        return false;
    }

    public /* synthetic */ boolean BMm() {
        return false;
    }

    public /* synthetic */ boolean BPt() {
        return true;
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public /* synthetic */ Object BAB(Class cls) {
        return null;
    }

    public /* synthetic */ int BF0(AnonymousClass3T1 r2) {
        return 1;
    }

    public /* synthetic */ boolean BMT(AnonymousClass3T1 r2) {
        return false;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }

    public /* synthetic */ boolean Bvv(AnonymousClass3T1 r2) {
        return false;
    }
}
