/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.workflow.modules.notifygru.business;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import fr.paris.lutece.plugins.workflow.modules.notifygru.utils.constants.Constants;
import fr.paris.lutece.plugins.workflowcore.business.config.TaskConfig;
import fr.paris.lutece.portal.service.mail.MailService;
import fr.paris.lutece.portal.service.util.AppPropertiesService;

/**
 * TaskNotifyDirectoryConfig.
 */
public class TaskNotifyGruConfig extends TaskConfig
{
    // Variables declarations
    /** The _str id spring provider. */
    /* global config */
    private String _strIdSpringProvider;

    private List<String> _listMarkerProviders = new ArrayList<>( );

    /** The _n demand status. */
    private int _nDemandStatus;

    /** The _ncrm status id. */
    private int _ncrmStatusId;

    /** The _n set onglet. */
    private int _nSetOnglet;

    /** The _str message guichet. */
    /* desk config */
    private String _strMessageGuichet;

    /** The _str statustext guichet. */
    private String _strStatustextGuichet;

    /** The _str sender name guichet. */
    private String _strSenderNameGuichet;

    /** The _str subject guichet. */
    private String _strSubjectGuichet;

    /** The _n demand max step guichet. */
    private int _nDemandMaxStepGuichet;

    /** The _n demand user current step guichet. */
    private int _nDemandUserCurrentStepGuichet;

    /** The _active onglet guichet. */
    private boolean _bActiveOngletGuichet;

    /** The _str statustext agent. */
    /* agent config */
    private String _strStatustextAgent;

    /** The _str message agent. */
    private String _strMessageAgent;

    /** The _active onglet agent. */
    private boolean _activeOngletAgent;

    /** The _str subject email. */
    /* email config */
    private String _strSubjectEmail;

    /** The _str message email. */
    private String _strMessageEmail;

    /** The _str sender name email. */
    private String _strSenderNameEmail;

    /** The _str recipients cc email. */
    private String _strRecipientsCcEmail;

    /** The _str recipients cci email. */
    private String _strRecipientsCciEmail;

    /** The _active onglet email. */
    private boolean _bActiveOngletEmail;

    /** The _str message sms. */
    /* sms config */
    private String _strMessageSMS;

    /** The _strBillingAccountSMS account id for sms */
    /* sms config */
    private String _strBillingAccountSMS;

    /** The _strBillingGroupSMS account group for sms */
    /* sms config */
    private String _strBillingGroupSMS;

    /** The _active onglet sms. */
    private boolean _bActiveOngletSMS;

    /* broadcast config */
    /** The _n id mailing list broadcast. */
    private int _nIdMailingListBroadcast;

    /** The _str email broadcast. */
    private String _strEmailBroadcast;

    /** The _str sender name broadcast. */
    private String _strSenderNameBroadcast;

    /** The _str subject broadcast. */
    private String _strSubjectBroadcast;

    /** The _str message broadcast. */
    private String _strMessageBroadcast;

    /** The _str recipients cc broadcast. */
    private String _strRecipientsCcBroadcast;

    /** The _str recipients cci broadcast. */
    private String _strRecipientsCciBroadcast;

    /** The _active onglet broadcast. */
    private boolean _bActiveOngletBroadcast;

    /** The _bBillingAccountBasedSmsNotification sms sending based on billing account */
    private boolean _bBillingAccountBasedSmsNotification;

    public TaskNotifyGruConfig( )
    {
        _bBillingAccountBasedSmsNotification = AppPropertiesService.getPropertyBoolean( Constants.PROPERTY_IS_BILLING_ACCOUNT_SMS_NEEDED, false );
    }

    /**
     * Gets the crm status id.
     *
     * @return the _ncrmStatusId
     */
    public int getCrmStatusId( )
    {
        return _ncrmStatusId;
    }

    /**
     * Sets the crm status id.
     *
     * @param crmStatusId
     *            the new crm status id
     */
    public void setCrmStatusId( int crmStatusId )
    {
        this._ncrmStatusId = crmStatusId;
    }

    /**
     * Returns the IdSpringProvider.
     *
     * @return The IdSpringProvider
     */
    public String getIdSpringProvider( )
    {
        return _strIdSpringProvider;
    }

    /**
     * Sets the IdSpringProvider.
     *
     * @param strIdSpringProvider
     *            The IdSpringProvider
     */
    public void setIdSpringProvider( String strIdSpringProvider )
    {
        _strIdSpringProvider = strIdSpringProvider;
    }

    /**
     * Gives the marker providers.
     *
     * @return The list of marker providers
     */
    public List<String> getMarkerProviders( )
    {
        return _listMarkerProviders;
    }

    /**
     * Sets the list of marker providers.
     *
     * @param listMarkerProviders
     *            The list of marker providers to set
     */
    public void setMarkerProviders( List<String> listMarkerProviders )
    {
        _listMarkerProviders = listMarkerProviders;
    }

    /**
     * Returns the DemandStatus.
     *
     * @return The DemandStatus
     */
    public int getDemandStatus( )
    {
        return _nDemandStatus;
    }

    /**
     * Sets the DemandStatus.
     *
     * @param nDemandStatus
     *            The DemandStatus
     */
    public void setDemandStatus( int nDemandStatus )
    {
        _nDemandStatus = nDemandStatus;
    }

    /**
     * Returns the SetOnglet.
     *
     * @return The SetOnglet
     */
    public int getSetOnglet( )
    {
        return _nSetOnglet;
    }

    /**
     * Sets the SetOnglet.
     *
     * @param nSetOnglet
     *            The SetOnglet
     */
    public void setSetOnglet( int nSetOnglet )
    {
        _nSetOnglet = nSetOnglet;
    }

    /**
     * Returns the MessageGuichet.
     *
     * @return The MessageGuichet
     */
    public String getMessageGuichet( )
    {
        return _strMessageGuichet;
    }

    /**
     * Sets the MessageGuichet.
     *
     * @param strMessageGuichet
     *            The MessageGuichet
     */
    public void setMessageGuichet( String strMessageGuichet )
    {
        _strMessageGuichet = strMessageGuichet;
    }

    /**
     * Returns the StatustextGuichet.
     *
     * @return The StatustextGuichet
     */
    public String getStatustextGuichet( )
    {
        return _strStatustextGuichet;
    }

    /**
     * Sets the StatustextGuichet.
     *
     * @param strStatustextGuichet
     *            The StatustextGuichet
     */
    public void setStatustextGuichet( String strStatustextGuichet )
    {
        _strStatustextGuichet = strStatustextGuichet;
    }

    /**
     * Returns the SenderNameGuichet.
     *
     * @return The SenderNameGuichet
     */
    public String getSenderNameGuichet( )
    {
        return _strSenderNameGuichet;
    }

    /**
     * Sets the SenderNameGuichet.
     *
     * @param strSenderNameGuichet
     *            The SenderNameGuichet
     */
    public void setSenderNameGuichet( String strSenderNameGuichet )
    {
        _strSenderNameGuichet = strSenderNameGuichet;
    }

    /**
     * Returns the SubjectGuichet.
     *
     * @return The SubjectGuichet
     */
    public String getSubjectGuichet( )
    {
        return _strSubjectGuichet;
    }

    /**
     * Sets the SubjectGuichet.
     *
     * @param strSubjectGuichet
     *            The SubjectGuichet
     */
    public void setSubjectGuichet( String strSubjectGuichet )
    {
        _strSubjectGuichet = strSubjectGuichet;
    }

    /**
     * Returns the DemandMaxStepGuichet.
     *
     * @return The DemandMaxStepGuichet
     */
    public int getDemandMaxStepGuichet( )
    {
        return _nDemandMaxStepGuichet;
    }

    /**
     * Sets the DemandMaxStepGuichet.
     *
     * @param nDemandMaxStepGuichet
     *            The DemandMaxStepGuichet
     */
    public void setDemandMaxStepGuichet( int nDemandMaxStepGuichet )
    {
        _nDemandMaxStepGuichet = nDemandMaxStepGuichet;
    }

    /**
     * Returns the DemandUserCurrentStepGuichet.
     *
     * @return The DemandUserCurrentStepGuichet
     */
    public int getDemandUserCurrentStepGuichet( )
    {
        return _nDemandUserCurrentStepGuichet;
    }

    /**
     * Sets the DemandUserCurrentStepGuichet.
     *
     * @param nDemandUserCurrentStepGuichet
     *            The DemandUserCurrentStepGuichet
     */
    public void setDemandUserCurrentStepGuichet( int nDemandUserCurrentStepGuichet )
    {
        _nDemandUserCurrentStepGuichet = nDemandUserCurrentStepGuichet;
    }

    /**
     * Returns the ActiveOngletGuichet.
     *
     * @return The ActiveOngletGuichet
     */
    public boolean isActiveOngletGuichet( )
    {
        return _bActiveOngletGuichet;
    }

    /**
     * Sets the ActiveOngletGuichet.
     *
     * @param bActiveOngletGuichet
     *            The ActiveOngletGuichet
     */
    public void setActiveOngletGuichet( boolean bActiveOngletGuichet )
    {
        _bActiveOngletGuichet = bActiveOngletGuichet;
    }

    /**
     * Returns the StatustextAgent.
     *
     * @return The StatustextAgent
     */
    public String getStatustextAgent( )
    {
        return _strStatustextAgent;
    }

    /**
     * Sets the StatustextAgent.
     *
     * @param strStatustextAgent
     *            The StatustextAgent
     */
    public void setStatustextAgent( String strStatustextAgent )
    {
        _strStatustextAgent = strStatustextAgent;
    }

    /**
     * Returns the MessageAgent.
     *
     * @return The MessageAgent
     */
    public String getMessageAgent( )
    {
        return _strMessageAgent;
    }

    /**
     * Sets the MessageAgent.
     *
     * @param strMessageAgent
     *            The MessageAgent
     */
    public void setMessageAgent( String strMessageAgent )
    {
        _strMessageAgent = strMessageAgent;
    }

    /**
     * Returns the ActiveOngletAgent.
     *
     * @return The ActiveOngletAgent
     */
    public boolean isActiveOngletAgent( )
    {
        return _activeOngletAgent;
    }

    /**
     * Sets the ActiveOngletAgent.
     *
     * @param activeOngletAgent
     *            The ActiveOngletAgent
     */
    public void setActiveOngletAgent( boolean activeOngletAgent )
    {
        _activeOngletAgent = activeOngletAgent;
    }

    /**
     * Returns the SubjectEmail.
     *
     * @return The SubjectEmail
     */
    public String getSubjectEmail( )
    {
        return _strSubjectEmail;
    }

    /**
     * Sets the SubjectEmail.
     *
     * @param strSubjectEmail
     *            The SubjectEmail
     */
    public void setSubjectEmail( String strSubjectEmail )
    {
        _strSubjectEmail = strSubjectEmail;
    }

    /**
     * Returns the MessageEmail.
     *
     * @return The MessageEmail
     */
    public String getMessageEmail( )
    {
        return _strMessageEmail;
    }

    /**
     * Sets the MessageEmail.
     *
     * @param strMessageEmail
     *            The MessageEmail
     */
    public void setMessageEmail( String strMessageEmail )
    {
        _strMessageEmail = strMessageEmail;
    }

    /**
     * Returns the SenderNameEmail.
     *
     * @return The SenderNameEmail
     */
    public String getSenderNameEmail( )
    {
    	if ( !StringUtils.isBlank( _strSenderNameEmail ) )
    	{
    		return _strSenderNameEmail;
    	} 
    	else
    	{
    		return AppPropertiesService.getProperty( Constants.PROPERTY_NOTIFY_MAIL_DEFAULT_SENDER_NAME, "NotifyGru");
    	}
    }

    /**
     * get default sender mail in properties (if set), the MailService.getNoReplyEmail() otherwise
     * 
     * @return the default server mail
     */
	public String getSenderEmail( ) 
	{
		return AppPropertiesService.getProperty( Constants.PROPERTY_NOTIFY_MAIL_DEFAULT_SENDER_MAIL, MailService.getNoReplyEmail( ) );
	}
	
    /**
     * Sets the SenderNameEmail.
     *
     * @param strSenderNameEmail
     *            The SenderNameEmail
     */
    public void setSenderNameEmail( String strSenderNameEmail )
    {
        _strSenderNameEmail = strSenderNameEmail;
    }

    /**
     * Returns the RecipientsCcEmail.
     *
     * @return The RecipientsCcEmail
     */
    public String getRecipientsCcEmail( )
    {
        return _strRecipientsCcEmail;
    }

    /**
     * Sets the RecipientsCcEmail.
     *
     * @param strRecipientsCcEmail
     *            The RecipientsCcEmail
     */
    public void setRecipientsCcEmail( String strRecipientsCcEmail )
    {
        _strRecipientsCcEmail = strRecipientsCcEmail;
    }

    /**
     * Returns the RecipientsCciEmail.
     *
     * @return The RecipientsCciEmail
     */
    public String getRecipientsCciEmail( )
    {
        return _strRecipientsCciEmail;
    }

    /**
     * Sets the RecipientsCciEmail.
     *
     * @param strRecipientsCciEmail
     *            The RecipientsCciEmail
     */
    public void setRecipientsCciEmail( String strRecipientsCciEmail )
    {
        _strRecipientsCciEmail = strRecipientsCciEmail;
    }

    /**
     * Returns the ActiveOngletEmail.
     *
     * @return The ActiveOngletEmail
     */
    public boolean isActiveOngletEmail( )
    {
        return _bActiveOngletEmail;
    }

    /**
     * Sets the ActiveOngletEmail.
     *
     * @param bActiveOngletEmail
     *            The ActiveOngletEmail
     */
    public void setActiveOngletEmail( boolean bActiveOngletEmail )
    {
        _bActiveOngletEmail = bActiveOngletEmail;
    }

    /**
     * Returns the MessageSMS.
     *
     * @return The MessageSMS
     */
    public String getMessageSMS( )
    {
        return _strMessageSMS;
    }

    /**
     * Sets the MessageSMS.
     *
     * @param strMessageSMS
     *            The MessageSMS
     */
    public void setMessageSMS( String strMessageSMS )
    {
        _strMessageSMS = strMessageSMS;
    }

    /**
     * Returns the accountIdSMS
     * 
     * @return strAccountIdSMS The account id SMS
     */
    public String getBillingAccountSMS( )
    {
        return _strBillingAccountSMS;
    }

    /**
     * Sets the billing account SMS
     * 
     * @param strBillingAccountSMS
     *            The billing account SMS
     */
    public void setBillingAccountSMS( String strBillingAccountSMS )
    {
        _strBillingAccountSMS = strBillingAccountSMS;
    }

    /**
     * Returns the billing group for SMS
     * 
     * @return _strBillingAccountSMS The account group for SMS
     */
    public String getBillingGroupSMS( )
    {
        return _strBillingGroupSMS;
    }

    /**
     * Sets the billing group SMS
     * 
     * @param strBillingGroupSMS
     *            The billing group SMS
     */
    public void setBillingGroupSMS( String strBillingGroupSMS )
    {
        _strBillingGroupSMS = strBillingGroupSMS;
    }

    /**
     * Returns the ActiveOngletSMS.
     *
     * @return The ActiveOngletSMS
     */
    public boolean isActiveOngletSMS( )
    {
        return _bActiveOngletSMS;
    }

    /**
     * Sets the ActiveOngletSMS.
     *
     * @param bActiveOngletSMS
     *            The ActiveOngletSMS
     */
    public void setActiveOngletSMS( boolean bActiveOngletSMS )
    {
        _bActiveOngletSMS = bActiveOngletSMS;
    }

    /**
     * Returns the IdMailingListBroadcast.
     *
     * @return The IdMailingListBroadcast
     */
    public int getIdMailingListBroadcast( )
    {
        return _nIdMailingListBroadcast;
    }

    /**
     * Sets the IdMailingListBroadcast.
     *
     * @param nIdMailingListBroadcast
     *            The IdMailingListBroadcast
     */
    public void setIdMailingListBroadcast( int nIdMailingListBroadcast )
    {
        _nIdMailingListBroadcast = nIdMailingListBroadcast;
    }

    /**
     * @return the EmailBroadcast
     */
    public String getEmailBroadcast( )
    {
        return _strEmailBroadcast;
    }

    /**
     * Sets the EmailBroadcast
     * 
     * @param strEmailBroadcast
     *            the _strEmailBroadcast to set
     */
    public void setEmailBroadcast( String strEmailBroadcast )
    {
        this._strEmailBroadcast = strEmailBroadcast;
    }

    /**
     * Returns the SenderNameBroadcast.
     *
     * @return The SenderNameBroadcast
     */
    public String getSenderNameBroadcast( )
    {
        return _strSenderNameBroadcast;
    }

    /**
     * Sets the SenderNameBroadcast.
     *
     * @param strSenderNameBroadcast
     *            The SenderNameBroadcast
     */
    public void setSenderNameBroadcast( String strSenderNameBroadcast )
    {
        _strSenderNameBroadcast = strSenderNameBroadcast;
    }

    /**
     * Returns the SubjectBroadcast.
     *
     * @return The SubjectBroadcast
     */
    public String getSubjectBroadcast( )
    {
        return _strSubjectBroadcast;
    }

    /**
     * Sets the SubjectBroadcast.
     *
     * @param strSubjectBroadcast
     *            The SubjectBroadcast
     */
    public void setSubjectBroadcast( String strSubjectBroadcast )
    {
        _strSubjectBroadcast = strSubjectBroadcast;
    }

    /**
     * Returns the MessageBroadcast.
     *
     * @return The MessageBroadcast
     */
    public String getMessageBroadcast( )
    {
        return _strMessageBroadcast;
    }

    /**
     * Sets the MessageBroadcast.
     *
     * @param strMessageBroadcast
     *            The MessageBroadcast
     */
    public void setMessageBroadcast( String strMessageBroadcast )
    {
        _strMessageBroadcast = strMessageBroadcast;
    }

    /**
     * Returns the RecipientsCcBroadcast.
     *
     * @return The RecipientsCcBroadcast
     */
    public String getRecipientsCcBroadcast( )
    {
        return _strRecipientsCcBroadcast;
    }

    /**
     * Sets the RecipientsCcBroadcast.
     *
     * @param strRecipientsCcBroadcast
     *            The RecipientsCcBroadcast
     */
    public void setRecipientsCcBroadcast( String strRecipientsCcBroadcast )
    {
        _strRecipientsCcBroadcast = strRecipientsCcBroadcast;
    }

    /**
     * Returns the RecipientsCciBroadcast.
     *
     * @return The RecipientsCciBroadcast
     */
    public String getRecipientsCciBroadcast( )
    {
        return _strRecipientsCciBroadcast;
    }

    /**
     * Sets the RecipientsCciBroadcast.
     *
     * @param strRecipientsCciBroadcast
     *            The RecipientsCciBroadcast
     */
    public void setRecipientsCciBroadcast( String strRecipientsCciBroadcast )
    {
        _strRecipientsCciBroadcast = strRecipientsCciBroadcast;
    }

    /**
     * Returns the ActiveOngletBroadcast.
     *
     * @return The ActiveOngletBroadcast
     */
    public boolean isActiveOngletBroadcast( )
    {
        return _bActiveOngletBroadcast;
    }

    /**
     * Sets the ActiveOngletBroadcast.
     *
     * @param bActiveOngletBroadcast
     *            The ActiveOngletBroadcast
     */
    public void setActiveOngletBroadcast( boolean bActiveOngletBroadcast )
    {
        _bActiveOngletBroadcast = bActiveOngletBroadcast;
    }

    /**
     * Get the billing account based sms notification boolean
     * 
     * @return true if a billing account is needed to send sms, false otherwise
     */
    public boolean isBillingAccountBasedSmsNotification( )
    {
        return _bBillingAccountBasedSmsNotification;
    }

    /**
     * Sets the billing account based sms notification boolean
     * 
     * @param bBillingAccountBasedSmsNotification
     *            the billing account based sms notification boolean
     */
    public void setBillingAccountBasedSmsNotification( boolean bBillingAccountBasedSmsNotification )
    {
        _bBillingAccountBasedSmsNotification = bBillingAccountBasedSmsNotification;
    }

}
