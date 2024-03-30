package X;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import com.whatsapp.community.CommunityExitDialogFragment;
import com.whatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import com.whatsapp.groupenforcements.ui.CreateGroupSuspendDialog;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.4XI  reason: invalid class name */
public class AnonymousClass4XI implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4XI(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Calendar calendar;
        int i2;
        C70523fI r5;
        boolean z;
        C65643Sx r2;
        Bitmap bitmap;
        AnonymousClass155 r0;
        switch (this.A03) {
            case 0:
                List list = (List) this.A00;
                AnonymousClass1NG r22 = (AnonymousClass1NG) this.A01;
                Activity activity = (Activity) this.A02;
                if (list.size() == 1) {
                    Object A0t = C36391kE.A0t(list);
                    C18740tg.A06(A0t);
                    r22.A0H(activity, (UserJid) A0t);
                    return;
                }
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(activity.getPackageName(), "com.whatsapp.blocklist.BlockList");
                activity.startActivity(A0D);
                return;
            case 3:
                ((C69923eJ) this.A00).A01.A0A((AnonymousClass155) this.A01, AnonymousClass2EP.A00, (C69893eG) this.A02, 5);
                return;
            case 4:
                CommunityExitDialogFragment communityExitDialogFragment = (CommunityExitDialogFragment) this.A00;
                Object obj = this.A02;
                ((C39971uO) this.A01).A0S();
                C36411kG.A1M(communityExitDialogFragment.A08, communityExitDialogFragment, obj, 46);
                return;
            case 5:
                PhoneNumberSelectionDialog phoneNumberSelectionDialog = (PhoneNumberSelectionDialog) this.A00;
                AbstractList abstractList = (AbstractList) this.A01;
                C37781nC r02 = (C37781nC) this.A02;
                AnonymousClass15Q r1 = phoneNumberSelectionDialog.A00;
                if (r1 != null) {
                    r1.Bbo(((AnonymousClass3XG) abstractList.get(r02.A00)).A00);
                }
                phoneNumberSelectionDialog.A1b();
                return;
            case 6:
                List list2 = (List) this.A01;
                AnonymousClass11F r23 = (AnonymousClass11F) this.A02;
                AnonymousClass01I A0h = ((AnonymousClass02E) this.A00).A0h();
                if (A0h instanceof AnonymousClass15F) {
                    ((AnonymousClass15F) A0h).BUQ(r23, ((C64533Oj) list2.get(i)).A00);
                    return;
                }
                return;
            case 7:
                r5 = (C70523fI) this.A00;
                r2 = (C65643Sx) this.A01;
                bitmap = (Bitmap) this.A02;
                r0 = C70523fI.A00(r5);
                z = true;
                break;
            case 8:
                r5 = (C70523fI) this.A00;
                r2 = (C65643Sx) this.A01;
                bitmap = (Bitmap) this.A02;
                r0 = C70523fI.A00(r5);
                z = false;
                break;
            case 9:
                AnonymousClass2KO r52 = (AnonymousClass2KO) this.A00;
                Activity activity2 = (Activity) this.A01;
                C206969uL r24 = (C206969uL) this.A02;
                AnonymousClass0FM r03 = r52.A00;
                Button button = null;
                if (r03 != null) {
                    button = r03.A00.A0H;
                }
                if (button != null) {
                    button.setEnabled(C36381kD.A1U(i, 3));
                }
                Calendar instance = Calendar.getInstance();
                AnonymousClass00C.A08(instance);
                r52.A03 = instance;
                Calendar instance2 = Calendar.getInstance();
                AnonymousClass00C.A08(instance2);
                r52.A02 = instance2;
                int i3 = 11;
                if (i != 0) {
                    if (i != 1) {
                        i3 = 5;
                        if (i == 2) {
                            calendar = r52.A03;
                            if (calendar == null) {
                                throw C36331k8.A0d("reminderDateTime");
                            }
                            i2 = 7;
                        } else if (i == 3) {
                            AnonymousClass3V1 r9 = new AnonymousClass3V1(activity2, r52);
                            Calendar calendar2 = r52.A03;
                            if (calendar2 == null) {
                                throw C36331k8.A0d("reminderDateTime");
                            }
                            int i4 = calendar2.get(1);
                            Calendar calendar3 = r52.A03;
                            if (calendar3 == null) {
                                throw C36331k8.A0d("reminderDateTime");
                            }
                            int i5 = calendar3.get(2);
                            Calendar calendar4 = r52.A03;
                            if (calendar4 == null) {
                                throw C36331k8.A0d("reminderDateTime");
                            }
                            DatePickerDialog datePickerDialog = new DatePickerDialog(activity2, r9, i4, i5, calendar4.get(5));
                            DatePicker datePicker = datePickerDialog.getDatePicker();
                            AnonymousClass00C.A08(datePicker);
                            datePicker.setMinDate(Calendar.getInstance().getTimeInMillis());
                            String str = r24.A01;
                            if (str != null) {
                                try {
                                    long j = C36441kJ.A1C(str).getLong("max_reminder_time_since_epoch_in_milliseconds");
                                    if (Long.valueOf(j) != null) {
                                        datePicker.setMaxDate(j);
                                    }
                                } catch (JSONException e) {
                                    Log.e("ReminderSetupAction: Unable to parse max timestamp out of params json", e);
                                }
                            }
                            datePickerDialog.show();
                            return;
                        } else if (i == 4) {
                            Calendar calendar5 = r52.A03;
                            if (calendar5 == null) {
                                throw C36331k8.A0d("reminderDateTime");
                            }
                            calendar5.add(13, 10);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        calendar = r52.A03;
                        if (calendar == null) {
                            throw C36331k8.A0d("reminderDateTime");
                        }
                        i2 = 24;
                    }
                    calendar.add(i3, i2);
                    return;
                }
                Calendar calendar6 = r52.A03;
                if (calendar6 == null) {
                    throw C36331k8.A0d("reminderDateTime");
                }
                calendar6.add(11, 1);
                return;
            case 10:
                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = (DocumentPickerActivity.SendDocumentsConfirmationDialogFragment) this.A00;
                ArrayList arrayList = (ArrayList) this.A01;
                AnonymousClass11F r3 = (AnonymousClass11F) this.A02;
                AnonymousClass01I A0h2 = sendDocumentsConfirmationDialogFragment.A0h();
                if (A0h2 != null) {
                    if (!C25571Gv.A04(sendDocumentsConfirmationDialogFragment.A02, r3, arrayList.size()) || !(A0h2 instanceof DocumentPickerActivity)) {
                        Intent A0D2 = C36431kI.A0D();
                        A0D2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        C36331k8.A0o(A0h2, A0D2);
                    } else {
                        DocumentPickerActivity.A0v((Uri) C36441kJ.A12(arrayList), (DocumentPickerActivity) sendDocumentsConfirmationDialogFragment.A0h());
                    }
                    sendDocumentsConfirmationDialogFragment.A04.A03(2);
                    return;
                }
                return;
            case 11:
                ((CreateGroupSuspendDialog) this.A00).A00.A00((C225314u) this.A01, (AnonymousClass147) this.A02);
                return;
            case 12:
                C80313vC.A01((C19770wU) this.A00, this.A01, this.A02, 3);
                return;
            case 13:
                C37821nG r12 = (C37821nG) this.A01;
                SelectPhoneNumberDialog selectPhoneNumberDialog = (SelectPhoneNumberDialog) this.A02;
                AnonymousClass00C.A0D(r12, 1);
                Log.i("SelectPhoneNumberDialog/use-clicked");
                AnonymousClass3XJ r4 = (AnonymousClass3XJ) ((List) this.A00).get(r12.A00);
                AnonymousClass4OX r32 = selectPhoneNumberDialog.A01;
                if (r32 != null) {
                    RegisterPhone registerPhone = (RegisterPhone) r32;
                    registerPhone.A0r.A02 = 1;
                    registerPhone.A0c = r4.A00;
                    String str2 = r4.A02;
                    registerPhone.A0d = str2;
                    registerPhone.A0O.A03.setText(str2);
                    registerPhone.A0O.A02.setText(registerPhone.A0c);
                    EditText editText = registerPhone.A0O.A03;
                    String A0h3 = C36331k8.A0h(editText.getText());
                    C18740tg.A06(A0h3);
                    editText.setSelection(A0h3.length());
                }
                selectPhoneNumberDialog.A1b();
                return;
            case 14:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A00;
                if (viewSharedContactArrayActivity.A01.A09(viewSharedContactArrayActivity, AnonymousClass3QX.A00(viewSharedContactArrayActivity, (Bitmap) this.A02, (C65643Sx) this.A01, true), 1)) {
                    viewSharedContactArrayActivity.A0E.A03(true, 10);
                    return;
                }
                return;
            case 15:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = (ViewSharedContactArrayActivity) this.A00;
                if (viewSharedContactArrayActivity2.A01.A09(viewSharedContactArrayActivity2, AnonymousClass3QX.A00(viewSharedContactArrayActivity2, (Bitmap) this.A02, (C65643Sx) this.A01, false), 1)) {
                    viewSharedContactArrayActivity2.A0E.A03(false, 10);
                    return;
                }
                return;
            default:
                C009904e r13 = (C009904e) this.A02;
                Intent A0D3 = C36381kD.A0D((Context) this.A01, 2);
                if (r13 != null) {
                    r13.A02(A0D3);
                    return;
                }
                return;
        }
        if (r5.A0M.getActivityUtils().A09(C70523fI.A00(r5), AnonymousClass3QX.A00(r0, bitmap, r2, z), 41)) {
            r5.A0z.A03(z, 6);
        }
    }
}
