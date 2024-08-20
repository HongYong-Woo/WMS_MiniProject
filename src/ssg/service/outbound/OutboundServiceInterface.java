package ssg.service.outbound;

import java.io.BufferedReader;
import ssg.enums.OutboundState;

public interface OutboundServiceInterface {
 public void okOutboundRequest(int id);
 public void outboundRequest(BufferedReader br);
 public void outboundList(OutboundState type);
}
