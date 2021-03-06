package sernet.gs.reveng;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * MbSchicht entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see sernet.gs.reveng.MbSchicht
 * @author MyEclipse Persistence Tools
 */

public class MbSchichtDAO extends BaseHibernateDAO {
	private static final Logger log = Logger.getLogger(MbSchichtDAO.class);
	// property constants
	public static final String LINK = "link";
	public static final String META_VERS = "metaVers";
	public static final String OBSOLET_VERS = "obsoletVers";
	public static final String GUID = "guid";
	public static final String ERFASST_DURCH = "erfasstDurch";
	public static final String GELOESCHT_DURCH = "geloeschtDurch";
	public static final String IMP_NEU = "impNeu";
	public static final String MTY_ID = "mtyId";
	public static final String GUID_ORG = "guidOrg";

	public void save(MbSchicht transientInstance) {
		log.debug("saving MbSchicht instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MbSchicht persistentInstance) {
		log.debug("deleting MbSchicht instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MbSchicht findById(sernet.gs.reveng.MbSchichtId id) {
		log.debug("getting MbSchicht instance with id: " + id);
		try {
			MbSchicht instance = (MbSchicht) getSession().get(
					"sernet.gs.reveng.MbSchicht", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MbSchicht instance) {
		log.debug("finding MbSchicht instance by example");
		try {
			List results = getSession().createCriteria(
					"sernet.gs.reveng.MbSchicht").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MbSchicht instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MbSchicht as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List findByMetaVers(Object metaVers) {
		return findByProperty(META_VERS, metaVers);
	}

	public List findByObsoletVers(Object obsoletVers) {
		return findByProperty(OBSOLET_VERS, obsoletVers);
	}

	public List findByGuid(Object guid) {
		return findByProperty(GUID, guid);
	}

	public List findByErfasstDurch(Object erfasstDurch) {
		return findByProperty(ERFASST_DURCH, erfasstDurch);
	}

	public List findByGeloeschtDurch(Object geloeschtDurch) {
		return findByProperty(GELOESCHT_DURCH, geloeschtDurch);
	}

	public List findByImpNeu(Object impNeu) {
		return findByProperty(IMP_NEU, impNeu);
	}

	public List findByMtyId(Object mtyId) {
		return findByProperty(MTY_ID, mtyId);
	}

	public List findByGuidOrg(Object guidOrg) {
		return findByProperty(GUID_ORG, guidOrg);
	}

	public List findAll() {
		log.debug("finding all MbSchicht instances");
		try {
			String queryString = "from MbSchicht";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MbSchicht merge(MbSchicht detachedInstance) {
		log.debug("merging MbSchicht instance");
		try {
			MbSchicht result = (MbSchicht) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MbSchicht instance) {
		log.debug("attaching dirty MbSchicht instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MbSchicht instance) {
		log.debug("attaching clean MbSchicht instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}