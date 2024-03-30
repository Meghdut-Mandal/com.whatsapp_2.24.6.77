package com.whatsapp.calling.telecom;

import X.C18700tb;
import X.C27671Pf;
import X.C31091bG;
import X.C31131bK;
import X.C91734cX;
import android.content.Intent;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.whatsapp.util.Log;

public class SelfManagedConnectionService extends ConnectionService implements C18700tb {
    public C27671Pf A00;
    public boolean A01;
    public final Object A02;
    public volatile C31091bG A03;

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C31091bG(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            ((C31131bK) generatedComponent()).A04(this);
        }
        super.onCreate();
        Log.i("voip/SelfManagedConnectionService/onCreate");
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateIncomingConnection ");
        C91734cX A032 = this.A00.A03(connectionRequest, false);
        if (A032 == null) {
            return Connection.createFailedConnection(new DisconnectCause(1));
        }
        return A032;
    }

    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateIncomingConnectionFailed");
        this.A00.A06(connectionRequest);
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateOutgoingConnection");
        C91734cX A032 = this.A00.A03(connectionRequest, true);
        if (A032 == null) {
            return Connection.createFailedConnection(new DisconnectCause(1));
        }
        A032.setDialing();
        return A032;
    }

    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Log.i("voip/SelfManagedConnectionService/onCreateOutgoingConnectionFailed");
        this.A00.A07(connectionRequest);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionService/onStartCommand ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onUnbind(Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionService/onUnbind ");
        sb.append(intent);
        Log.i(sb.toString());
        return super.onUnbind(intent);
    }

    public SelfManagedConnectionService(int i) {
        this.A02 = new Object();
        this.A01 = false;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("voip/SelfManagedConnectionService/onDestroy");
    }

    public SelfManagedConnectionService() {
        this(0);
    }
}
