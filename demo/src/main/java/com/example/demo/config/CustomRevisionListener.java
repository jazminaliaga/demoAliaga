package com.example.demo.config;

import com.example.demo.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionentity) {
        final Revision revision = (Revision) revisionentity;
    }
}
