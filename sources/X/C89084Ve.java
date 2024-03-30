package X;

import android.app.Application;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;

/* renamed from: X.4Ve  reason: invalid class name and case insensitive filesystem */
public class C89084Ve extends AnonymousClass04N {
    public Object A00;
    public final int A01;

    public C89084Ve(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass04R B3o(Class cls) {
        Class cls2 = cls;
        if (this.A01 != 0) {
            if (cls2.isAssignableFrom(C40031ud.class)) {
                RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = (RestoreFromConsumerDatabaseActivity) this.A00;
                C19770wU r17 = restoreFromConsumerDatabaseActivity.A04;
                C29301Wc r15 = restoreFromConsumerDatabaseActivity.A02;
                AnonymousClass54Q r14 = restoreFromConsumerDatabaseActivity.A04;
                AnonymousClass18U r13 = restoreFromConsumerDatabaseActivity.A05;
                C20720y3 r12 = restoreFromConsumerDatabaseActivity.A07;
                AnonymousClass54W r11 = restoreFromConsumerDatabaseActivity.A0I;
                AnonymousClass3T0 r10 = restoreFromConsumerDatabaseActivity.A0H;
                AnonymousClass1CR r9 = restoreFromConsumerDatabaseActivity.A0G;
                C20280xJ r8 = restoreFromConsumerDatabaseActivity.A08;
                AnonymousClass12P r7 = restoreFromConsumerDatabaseActivity.A06;
                C29501Ww r6 = restoreFromConsumerDatabaseActivity.A0A;
                C19420v0 r5 = restoreFromConsumerDatabaseActivity.A09;
                AnonymousClass1QE r4 = restoreFromConsumerDatabaseActivity.A0B;
                AnonymousClass1QG r3 = restoreFromConsumerDatabaseActivity.A0E;
                C24401Ch r2 = restoreFromConsumerDatabaseActivity.A0F;
                C19770wU r33 = r17;
                C24401Ch r29 = r2;
                AnonymousClass1CR r30 = r9;
                AnonymousClass3T0 r31 = r10;
                AnonymousClass1QE r26 = r4;
                AnonymousClass1QD r27 = restoreFromConsumerDatabaseActivity.A0D;
                AnonymousClass1QG r28 = r3;
                return new C40031ud(r13, r15, r14, r5, r7, r12, r8, restoreFromConsumerDatabaseActivity.A09, r6, r26, r27, r28, r29, r30, r31, r11, r33);
            }
            throw AnonymousClass001.A08("Invalid viewModel");
        } else if (cls2.isAssignableFrom(C39451sL.class)) {
            ContactsAttachmentSelector contactsAttachmentSelector = (ContactsAttachmentSelector) this.A00;
            Application application = contactsAttachmentSelector.getApplication();
            C19630wG r52 = contactsAttachmentSelector.A02;
            AnonymousClass16D r42 = contactsAttachmentSelector.A09;
            C21060yb r32 = contactsAttachmentSelector.A08;
            C28271Rz r22 = contactsAttachmentSelector.A03;
            C19630wG r21 = r52;
            C18820ts r222 = contactsAttachmentSelector.A0I;
            AnonymousClass16D r19 = r42;
            C21060yb r20 = r32;
            return new C39451sL(application, contactsAttachmentSelector.A00, r19, r20, r21, r222, r22);
        } else {
            throw AnonymousClass001.A08("Invalid viewModel");
        }
    }
}
