package org.linkedIn.course.chapter.abstraction.challenge;

public class PasswordChangeEvent extends AbstractEvent
{
    public PasswordChangeEvent(String id)
    {
        super(id);
    }

    @Override
    public void process()
    {
        System.out.println("Customer " + id + " change their password. Sending a confirmation email to the customer.");
    }
}
