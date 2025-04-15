// ITSupportDomain.java
public class ITSupportDomain {
    private String domainName;
    private ITSupportQuestion[] questions;

    public ITSupportDomain(String domainName, ITSupportQuestion[] questions) {
        this.domainName = domainName;
        this.questions = questions;
    }

    public String getDomainName() {
        return domainName;
    }

    public ITSupportQuestion[] getQuestions() {
        return questions;
    }
}
