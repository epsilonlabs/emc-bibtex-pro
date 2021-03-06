/**
 */
package org.eclipse.epsilon.emc.bibtex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.epsilon.emc.bibtex.PublicationEntry#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.emc.bibtex.PublicationEntry#getCitationKey <em>Citation Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.epsilon.emc.bibtex.BibtexPackage#getPublicationEntry()
 * @model
 * @generated
 */
public interface PublicationEntry extends Entry {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.epsilon.emc.bibtex.BibtexPackage#getPublicationEntry_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.emc.bibtex.PublicationEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Citation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citation Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation Key</em>' attribute.
	 * @see #setCitationKey(String)
	 * @see org.eclipse.epsilon.emc.bibtex.BibtexPackage#getPublicationEntry_CitationKey()
	 * @model required="true"
	 * @generated
	 */
	String getCitationKey();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.emc.bibtex.PublicationEntry#getCitationKey <em>Citation Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation Key</em>' attribute.
	 * @see #getCitationKey()
	 * @generated
	 */
	void setCitationKey(String value);

} // PublicationEntry
