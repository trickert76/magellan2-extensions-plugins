package magellan.plugin.statistics.torque.map;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.adapter.DB;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.TableMap;

/**
 * Contains informations about turn specific region data
 *
  *  This class was autogenerated by Torque on:
  *
  * [Sat May 24 14:39:45 CEST 2008]
  *
  */
public class RegionStatisticsDataMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "magellan.plugin.statistics.torque.map.RegionStatisticsDataMapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public synchronized void doBuild() throws TorqueException
    {
        if ( isBuilt() ) {
            return;
        }
        dbMap = Torque.getDatabaseMap("statistics");

        dbMap.addTable("region_statistics_data");
        TableMap tMap = dbMap.getTable("region_statistics_data");
        tMap.setJavaName("RegionStatisticsData");
        tMap.setOMClass( magellan.plugin.statistics.torque.RegionStatisticsData.class );
        tMap.setPeerClass( magellan.plugin.statistics.torque.RegionStatisticsDataPeer.class );
        tMap.setDescription("Contains informations about turn specific region data");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        DB dbAdapter = Torque.getDB("statistics");
        if (dbAdapter.getIDMethodType().equals(DB.SEQUENCE))
        {
            tMap.setPrimaryKeyMethodInfo("region_statistics_data_SEQ");
        }
        else if (dbAdapter.getIDMethodType().equals(DB.AUTO_INCREMENT))
        {
            tMap.setPrimaryKeyMethodInfo("region_statistics_data");
        }

        ColumnMap cMap = null;


  // ------------- Column: id --------------------
        cMap = new ColumnMap( "id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(true);
        cMap.setNotNull(true);
        cMap.setJavaName( "ID" );
        cMap.setAutoIncrement(true);
        cMap.setProtected(false);
        cMap.setInheritance("false");
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: region_id --------------------
        cMap = new ColumnMap( "region_id", tMap);
        cMap.setType( new Long(0) );
        cMap.setTorqueType( "BIGINT" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "RegionId" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("This is the region");
        cMap.setInheritance("false");
        cMap.setForeignKey("region_statistics", "id");
        cMap.setPosition(2);
        tMap.addColumn(cMap);
  // ------------- Column: turn --------------------
        cMap = new ColumnMap( "turn", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Turn" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The unique turn data of the region");
        cMap.setInheritance("false");
        cMap.setPosition(3);
        tMap.addColumn(cMap);
  // ------------- Column: type --------------------
        cMap = new ColumnMap( "type", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Type" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The type of the region");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(4);
        tMap.addColumn(cMap);
  // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases name of the region");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(5);
        tMap.addColumn(cMap);
  // ------------- Column: description --------------------
        cMap = new ColumnMap( "description", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Description" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases description of the region");
        cMap.setInheritance("false");
        cMap.setSize( 255 );
        cMap.setPosition(6);
        tMap.addColumn(cMap);
  // ------------- Column: max_recruits --------------------
        cMap = new ColumnMap( "max_recruits", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "MaxRecruits" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases max number of recruits in the region");
        cMap.setInheritance("false");
        cMap.setPosition(7);
        tMap.addColumn(cMap);
  // ------------- Column: max_luxuries --------------------
        cMap = new ColumnMap( "max_luxuries", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "MaxLuxuries" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases max number of buyable luxuries in the region");
        cMap.setInheritance("false");
        cMap.setPosition(8);
        tMap.addColumn(cMap);
  // ------------- Column: max_entertain --------------------
        cMap = new ColumnMap( "max_entertain", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "MaxEntertain" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases max entertainment silber in the region");
        cMap.setInheritance("false");
        cMap.setPosition(9);
        tMap.addColumn(cMap);
  // ------------- Column: stones --------------------
        cMap = new ColumnMap( "stones", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Stones" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of stones in the region");
        cMap.setInheritance("false");
        cMap.setPosition(10);
        tMap.addColumn(cMap);
  // ------------- Column: trees --------------------
        cMap = new ColumnMap( "trees", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Trees" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of trees in the region");
        cMap.setInheritance("false");
        cMap.setPosition(11);
        tMap.addColumn(cMap);
  // ------------- Column: sprouts --------------------
        cMap = new ColumnMap( "sprouts", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Sprouts" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of sprouts in the region");
        cMap.setInheritance("false");
        cMap.setPosition(12);
        tMap.addColumn(cMap);
  // ------------- Column: silver --------------------
        cMap = new ColumnMap( "silver", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Silver" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases silver in the region");
        cMap.setInheritance("false");
        cMap.setPosition(13);
        tMap.addColumn(cMap);
  // ------------- Column: peasants --------------------
        cMap = new ColumnMap( "peasants", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Peasants" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of peasants in the region");
        cMap.setInheritance("false");
        cMap.setPosition(14);
        tMap.addColumn(cMap);
  // ------------- Column: inhabitants --------------------
        cMap = new ColumnMap( "inhabitants", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Inhabitants" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of inhabitants in the region");
        cMap.setInheritance("false");
        cMap.setPosition(15);
        tMap.addColumn(cMap);
  // ------------- Column: iron --------------------
        cMap = new ColumnMap( "iron", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Iron" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of iron in the region");
        cMap.setInheritance("false");
        cMap.setPosition(16);
        tMap.addColumn(cMap);
  // ------------- Column: laen --------------------
        cMap = new ColumnMap( "laen", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Laen" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases number of laen in the region");
        cMap.setInheritance("false");
        cMap.setPosition(17);
        tMap.addColumn(cMap);
  // ------------- Column: herb --------------------
        cMap = new ColumnMap( "herb", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(false);
        cMap.setJavaName( "Herb" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("The turn bases herb in the region");
        cMap.setInheritance("false");
        cMap.setSize( 50 );
        cMap.setPosition(18);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
