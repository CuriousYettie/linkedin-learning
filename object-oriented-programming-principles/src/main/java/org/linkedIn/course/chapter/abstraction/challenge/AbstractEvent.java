package org.linkedIn.course.chapter.abstraction.challenge;

import java.sql.Time;

public abstract class AbstractEvent implements Event
{
    protected final Long createdTimestamp;
    protected final String id;

    public AbstractEvent(String id)
    {
        this.createdTimestamp = new Time(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp()
    {
        return this.createdTimestamp;
    }

    public abstract void process();
}
