package com.wix.specialble.db;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.wix.crypto.Contact;
import com.wix.specialble.bt.Device;
import com.wix.specialble.bt.Scan;
import com.wix.specialble.kays.PublicKey;

@Database(entities = {Device.class, Scan.class, Contact.class}, version = 3, exportSchema = true)
public abstract class SpecialBLEDatabase extends RoomDatabase {
    public abstract DeviceDao deviceDao();
    public abstract ScanDao scanDao();
    public abstract ContactDao contactDao();
}

