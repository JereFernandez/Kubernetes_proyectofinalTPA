package com.example.persona.Config;

import com.example.persona.Entities.Audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
