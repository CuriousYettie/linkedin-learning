package org.linkedIn.course.chapter.abstraction.interfaces;

import java.sql.Time;

public class AccountTransferEvent implements Event
{
    private Long createdTimestamp;
    private String id;

    public AccountTransferEvent(String id)
    {
        this.createdTimestamp = new Time(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp()
    {
        return this.createdTimestamp;
    }

    @Override
    public void process()
    {
        System.out.println("Customer " + id + " needs to transfer their service. Reaching out to CTE to remove from old device and add service to new device");
    }
}
