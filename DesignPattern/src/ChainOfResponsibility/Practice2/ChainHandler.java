package ChainOfResponsibility.Practice2;
public interface ChainHandler {
void setNextChain(ChainHandler nextChain);
void handleRequest(EMail request);
}
