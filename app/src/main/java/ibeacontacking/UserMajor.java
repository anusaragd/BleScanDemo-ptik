package ibeacontacking;

import com.minew.beacon.BeaconValueIndex;
import com.minew.beacon.MinewBeacon;

import java.util.Comparator;

public class UserMajor implements Comparator<MinewBeacon> {
    @Override
    public int compare(MinewBeacon minewBeacon, MinewBeacon minewBeacon1) {

        String strMajor = minewBeacon.getBeaconValue(BeaconValueIndex.MinewBeaconValueIndex_Major).getStringValue();

        if (strMajor.equals("1")){
            return 1;
        }else{
            return -1;
        }
    }
}


