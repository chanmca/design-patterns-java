package org.codewithmosh.behavioural.template;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    protected Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
