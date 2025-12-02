package tcmodern.common.library;

import train.common.utils.lockout.ILockoutGroup;


public enum TCMLockoutGroups implements ILockoutGroup {
    SpawnlineExpress(),
    ;


    /**
     * When a value is here it is impossible to change the group owner
     * without changing it here. This also has the affect of no matter
     * where you run this you will always be the owner.
     */
    final String GroupDefaultUUIDOwner;

    TCMLockoutGroups() { GroupDefaultUUIDOwner = "SYSTEM"; }

    TCMLockoutGroups(String groupDefaultUUIDOwner) { GroupDefaultUUIDOwner = groupDefaultUUIDOwner; }

    @Override
    public String groupUUIDOwner() { return GroupDefaultUUIDOwner; }
}
