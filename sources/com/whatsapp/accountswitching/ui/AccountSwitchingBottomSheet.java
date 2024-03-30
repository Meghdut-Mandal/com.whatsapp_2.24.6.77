package com.whatsapp.accountswitching.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass03X;
import X.AnonymousClass142;
import X.AnonymousClass17Y;
import X.AnonymousClass1Q6;
import X.AnonymousClass1RU;
import X.AnonymousClass1RW;
import X.AnonymousClass1Z0;
import X.AnonymousClass3KU;
import X.AnonymousClass3LV;
import X.AnonymousClass4WP;
import X.AnonymousClass6TO;
import X.C133346Xy;
import X.C18820ts;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C27761Ps;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C63073Iq;
import X.C89834Yb;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public final class AccountSwitchingBottomSheet extends Hilt_AccountSwitchingBottomSheet {
    public int A00;
    public View A01;
    public ViewStub A02;
    public BottomSheetListView A03;
    public C19700wN A04;
    public AnonymousClass17Y A05;
    public C19730wQ A06;
    public AnonymousClass1RU A07;
    public AnonymousClass1Z0 A08;
    public AnonymousClass6TO A09;
    public AnonymousClass1RW A0A;
    public AnonymousClass1Q6 A0B;
    public C27761Ps A0C;
    public C18820ts A0D;
    public C19770wU A0E;
    public AnonymousClass005 A0F;
    public String A0G;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1J() {
        this.A03 = null;
        this.A02 = null;
        AnonymousClass1RW r1 = this.A0A;
        if (r1 != null) {
            AnonymousClass1Q6 r0 = this.A0B;
            if (r0 != null) {
                r0.unregisterObserver(r1);
            } else {
                throw C36331k8.A0d("inactiveAccountBadgingObservers");
            }
        }
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Log.i("AccountSwitchingBottomSheet/onViewCreated");
        Bundle bundle2 = this.A0A;
        if (bundle2 == null) {
            bundle2 = AnonymousClass001.A07();
        }
        this.A00 = bundle2.getInt("source", 0);
        Bundle bundle3 = this.A0A;
        if (bundle3 == null) {
            bundle3 = AnonymousClass001.A07();
        }
        this.A0G = bundle3.getString("landing_screen");
        this.A01 = view;
        C19770wU r1 = this.A0E;
        if (r1 != null) {
            C36391kE.A1Q(new AnonymousClass4WP((Object) this, 0), r1);
            AnonymousClass6TO r3 = this.A09;
            if (r3 != null) {
                r3.A02((Boolean) null, this.A00, 1);
                return;
            }
            throw C36331k8.A0d("accountSwitchingLogger");
        }
        throw C36321k7.A08();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Log.i("AccountSwitchingBottomSheet/onDismiss");
        AnonymousClass6TO r3 = this.A09;
        if (r3 != null) {
            r3.A02((Boolean) null, this.A00, 2);
            return;
        }
        throw C36331k8.A0d("accountSwitchingLogger");
    }

    public static final ArrayList A03(AccountSwitchingBottomSheet accountSwitchingBottomSheet) {
        Bitmap bitmap;
        Bitmap bitmap2;
        StringBuilder A0v;
        String str;
        String A0q;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1RU r0 = accountSwitchingBottomSheet.A07;
        if (r0 != null) {
            AnonymousClass3KU A032 = r0.A03();
            if (A032 != null) {
                C19730wQ r02 = accountSwitchingBottomSheet.A06;
                if (r02 != null) {
                    r02.A0G();
                    AnonymousClass142 r6 = r02.A0E;
                    if (r6 != null) {
                        int dimensionPixelSize = C36341k9.A0G(accountSwitchingBottomSheet).getDimensionPixelSize(R.dimen.f7nameremoved);
                        C27761Ps r4 = accountSwitchingBottomSheet.A0C;
                        if (r4 != null) {
                            bitmap = r4.A07(accountSwitchingBottomSheet.A0a(), r6, -1.0f, dimensionPixelSize, false);
                        } else {
                            throw C36331k8.A0d("contactPhotosBitmapManager");
                        }
                    } else {
                        bitmap = null;
                    }
                    A0I.add(new C63073Iq(bitmap, A032, true));
                    AnonymousClass1Z0 r03 = accountSwitchingBottomSheet.A08;
                    if (r03 != null) {
                        for (AnonymousClass3KU r5 : AnonymousClass1Z0.A00(r03).A01) {
                            AnonymousClass1RU r1 = accountSwitchingBottomSheet.A07;
                            if (r1 != null) {
                                AnonymousClass00C.A0D(r5, 0);
                                C133346Xy r3 = (C133346Xy) r1.A0E.get();
                                if (r3 != null) {
                                    AnonymousClass00T r12 = r3.A06;
                                    if (!((File) r12.getValue()).exists()) {
                                        A0q = "AccountSwitchingFileManager/getInactiveAccountProfilePhoto/staging dir does not exist";
                                    } else {
                                        String absolutePath = ((File) r12.getValue()).getAbsolutePath();
                                        String str2 = r5.A08;
                                        File file = new File(absolutePath, str2);
                                        if (!file.exists()) {
                                            StringBuilder A0v2 = AnonymousClass000.A0v("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ");
                                            A0v2.append(AnonymousClass3LV.A01(str2));
                                            C36321k7.A1a(A0v2, " dir does not exist");
                                            A0v = AnonymousClass000.A0u();
                                            A0v.append("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/stagingDirLogString/");
                                            str = AnonymousClass3LV.A00(r3);
                                        } else {
                                            File file2 = new File(file.getAbsolutePath(), "files/me.jpg");
                                            if (!file2.exists()) {
                                                A0v = AnonymousClass000.A0v("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ");
                                                A0v.append(AnonymousClass3LV.A01(str2));
                                                str = " img file does not exist";
                                            } else {
                                                String absolutePath2 = file2.getAbsolutePath();
                                                if (absolutePath2 != null) {
                                                    bitmap2 = BitmapFactory.decodeFile(absolutePath2);
                                                    A0I.add(new C63073Iq(bitmap2, r5, false));
                                                }
                                            }
                                        }
                                        A0q = AnonymousClass000.A0q(str, A0v);
                                    }
                                    Log.i(A0q);
                                }
                                bitmap2 = null;
                                A0I.add(new C63073Iq(bitmap2, r5, false));
                            } else {
                                throw C36331k8.A0d("accountSwitcher");
                            }
                        }
                        if (A0I.size() > 1) {
                            AnonymousClass03X.A08(A0I, new C89834Yb(0));
                            return A0I;
                        }
                    } else {
                        throw C36331k8.A0d("accountSwitchingDataRepo");
                    }
                } else {
                    throw C36331k8.A0d("meManager");
                }
            }
            return A0I;
        }
        throw C36331k8.A0d("accountSwitcher");
    }
}
