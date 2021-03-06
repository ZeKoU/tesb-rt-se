package org.talend.esb.sam.service;

import java.util.List;

import org.talend.esb.sam.common.event.Event;
import org.talend.esb.sam.server.ui.CriteriaAdapter;


public interface SAMProvider {
    
    Event getEventDetails(Integer eventID);
    
    List<FlowEvent> getFlowDetails(String flowID);

    List<Flow> getFlows(CriteriaAdapter criteria);
}
