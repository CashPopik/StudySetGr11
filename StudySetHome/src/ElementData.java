//package io.anon10w1z.periodictable;

public class ElementData {
	public static Element emptyElement = new Element();
	private static int TOTAL_ELEMENTS = 152;
	public static Element[] elements = new Element[TOTAL_ELEMENTS];

	static {
		int i;
		for (i = 0; i < TOTAL_ELEMENTS; ++i) {
			elements[i] = new Element();
			elements[i].atomicNumber = i + 1;
		}
		elements[0].name = "Hydrogen";
		elements[1].name = "Helium";
		elements[2].name = "Lithium";
		elements[3].name = "Beryllium";
		elements[4].name = "Boride";
		elements[5].name = "Carbon";
		elements[6].name = "Nitride";
		elements[7].name = "Oxide";
		elements[8].name = "Flouride";
		elements[9].name = "Neon";
		elements[10].name = "Sodium";
		elements[11].name = "Magnesium";
		elements[12].name = "Aluminum";
		elements[13].name = "Silicide";
		elements[14].name = "Phosphide";
		elements[15].name = "Sulfide";
		elements[16].name = "Chloride";
		elements[17].name = "Argon";
		elements[18].name = "Potassium";
		elements[19].name = "Calcium";
		elements[20].name = "Scandium";
		elements[21].name = "Titanium (IV)";
		elements[22].name = "Vanadium (V)";
		elements[23].name = "Chromium (III)";
		elements[24].name = "Manganese (II)";
		elements[25].name = "Iron (III)";
		elements[26].name = "Cobalt (II)";
		elements[27].name = "Nickel (II)";
		elements[28].name = "Copper (II)";
		elements[29].name = "Zinc";
		elements[30].name = "Gallium";
		elements[31].name = "Germanium";
		elements[32].name = "Arsenide";
		elements[33].name = "Selenide";
		elements[34].name = "Bromide";
		elements[35].name = "Krypton";
		elements[36].name = "Rubidium";
		elements[37].name = "Strontium";
		elements[38].name = "Yttrium";
		elements[39].name = "Zirconium";
		elements[40].name = "Niobium (V)";
		elements[41].name = "Molybdenum (VI)";
		elements[42].name = "Technetium";
		elements[43].name = "Ruthenium (III)";
		elements[44].name = "Rhodium";
		elements[45].name = "Palladium (II)";
		elements[46].name = "Silver";
		elements[47].name = "Cadmium";
		elements[48].name = "Indium";
		elements[49].name = "Tin (IV)";
		elements[50].name = "Antimony (III)";
		elements[51].name = "Telluride";
		elements[52].name = "Iodide";
		elements[53].name = "Xenon";
		elements[54].name = "Caesium";
		elements[55].name = "Barium";
		elements[56].name = "Lanthanum";
		elements[57].name = "Cerium";
		elements[58].name = "Praseodymium";
		elements[59].name = "Neodymium";
		elements[60].name = "Prometheum";
		elements[61].name = "Samarium (III)";
		elements[62].name = "Europium (III)";
		elements[63].name = "Gadolinium";
		elements[64].name = "Terbium";
		elements[65].name = "Dysprosium";
		elements[66].name = "Holmium";
		elements[67].name = "Erbium";
		elements[68].name = "Thulium";
		elements[69].name = "Ytterbium (III)";
		elements[70].name = "Lutetnium";
		elements[71].name = "Hafnium";
		elements[72].name = "Tantalum";
		elements[73].name = "Tungsten";
		elements[74].name = "Rhenium";
		elements[75].name = "Osmium";
		elements[76].name = "Iridium";
		elements[77].name = "Platinum (IV)";
		elements[78].name = "Gold (III)";
		elements[79].name = "Mercury (II)";
		elements[80].name = "Thallium (I)";
		elements[81].name = "Lead (II)";
		elements[82].name = "Bismuth (III)";
		elements[83].name = "Polonium (II)";
		elements[84].name = "Astatide";
		elements[85].name = "Radon";
		elements[86].name = "Francium";
		elements[87].name = "Radium";
		elements[88].name = "Actinium";
		elements[89].name = "Thorium";
		elements[90].name = "Protactium (V)";
		elements[91].name = "Uranium (VI)";
		elements[92].name = "Neptunium";
		elements[93].name = "Plutonium (IV)";
		elements[94].name = "Americium (III)";
		elements[95].name = "Curium";
		elements[96].name = "Berkelium (III)";
		elements[97].name = "Californium";
		elements[98].name = "Einsteinium";
		elements[99].name = "Fermium";
		elements[100].name = "Mendelevium (II)";
		elements[101].name = "Nobelium (II)";
		elements[102].name = "Lawrencium";
		elements[103].name = "Rutherfordium";
		elements[104].name = "Dubnium";
		elements[105].name = "Seaborgium";
		elements[106].name = "Bohrium";
		elements[107].name = "Hassium";
		elements[108].name = "Meitnerium";
    //unknown chemical quarentine area
		elements[109].name = "Darmstadtium";
		elements[110].name = "Roentgenium";
		elements[111].name = "Copernicium";
		elements[112].name = "Ununtrium";
		elements[113].name = "Flevorium";
		elements[114].name = "Ununpentium";
		elements[115].name = "Livermorium";
		elements[116].name = "Ununseptium";
		elements[117].name = "Ununoctium";
    //chemicals unknown
    //polyatomic ions
    elements[118].name = "acetate";
    elements[119].name = "ammonium";
    elements[120].name = "benzoate";
    elements[121].name = "borate";
    elements[122].name = "carbide";
    elements[123].name = "carbonate";
    elements[124].name = "hydrogen carbonate";
    elements[125].name = "perchlorate";
    elements[126].name = "chlorate";
    elements[127].name = "chlorite";
    elements[128].name = "hypochlorite";
    elements[129].name = "chromate";
    elements[130].name = "dichromate";
    elements[131].name = "cyanide";
    elements[132].name = "hydroxide";
    elements[133].name = "iodate";
    elements[134].name = "nitrate";
    elements[135].name = "nitrite";
    elements[136].name = "oxalate";
    elements[137].name = "hydrogen oxalate";
    elements[138].name = "permanganate";
    elements[139].name = "peroxide";
    elements[140].name = "persulfide";
    elements[141].name = "phosphate";
    elements[142].name = "hydrogen phosphate";
    elements[143].name = "dihydrogen phosphate";
    elements[144].name = "silicate";
    elements[145].name = "sulfate";
    elements[146].name = "hydrogen sulfate";
    elements[147].name = "sulfite";
    elements[148].name = "hydrogen sulfite";
    elements[149].name = "hydrogen sulfide";
    elements[150].name = "thiocyanate";
    elements[151].name = "thiosulfate";
   

		elements[0].symbol = "H";
		elements[1].symbol = "He";
		elements[2].symbol = "Li";
		elements[3].symbol = "Be";
		elements[4].symbol = "B";
		elements[5].symbol = "C";
		elements[6].symbol = "N";
		elements[7].symbol = "O";
		elements[8].symbol = "F";
		elements[9].symbol = "Ne";
		elements[10].symbol = "Na";
		elements[11].symbol = "Mg";
		elements[12].symbol = "Al";
		elements[13].symbol = "Si";
		elements[14].symbol = "P";
		elements[15].symbol = "S";
		elements[16].symbol = "Cl";
		elements[17].symbol = "Ar";
		elements[18].symbol = "K";
		elements[19].symbol = "Ca";
		elements[20].symbol = "Sc";
		elements[21].symbol = "Ti";
		elements[22].symbol = "V";
		elements[23].symbol = "Cr";
		elements[24].symbol = "Mn";
		elements[25].symbol = "Fe";
		elements[26].symbol = "Co";
		elements[27].symbol = "Ni";
		elements[28].symbol = "Cu";
		elements[29].symbol = "Zn";
		elements[30].symbol = "Ga";
		elements[31].symbol = "Ge";
		elements[32].symbol = "As";
		elements[33].symbol = "Se";
		elements[34].symbol = "Br";
		elements[35].symbol = "Kr";
		elements[36].symbol = "Rb";
		elements[37].symbol = "Sr";
		elements[38].symbol = "Y";
		elements[39].symbol = "Zr";
		elements[40].symbol = "Nb";
		elements[41].symbol = "Mo";
		elements[42].symbol = "Tc";
		elements[43].symbol = "Ru";
		elements[44].symbol = "Rh";
		elements[45].symbol = "Pd";
		elements[46].symbol = "Ag";
		elements[47].symbol = "Cd";
		elements[48].symbol = "In";
		elements[49].symbol = "Sn";
		elements[50].symbol = "Sb";
		elements[51].symbol = "Te";
		elements[52].symbol = "I";
		elements[53].symbol = "Xe";
		elements[54].symbol = "Cs";
		elements[55].symbol = "Ba";
		elements[56].symbol = "La";
		elements[57].symbol = "Ce";
		elements[58].symbol = "Pr";
		elements[59].symbol = "Nd";
		elements[60].symbol = "Pm";
		elements[61].symbol = "Sm";
		elements[62].symbol = "Eu";
		elements[63].symbol = "Gd";
		elements[64].symbol = "Tb";
		elements[65].symbol = "Dy";
		elements[66].symbol = "Ho";
		elements[67].symbol = "Er";
		elements[68].symbol = "Tm";
		elements[69].symbol = "Yb";
		elements[70].symbol = "Lu";
		elements[71].symbol = "Hf";
		elements[72].symbol = "Ta";
		elements[73].symbol = "W";
		elements[74].symbol = "Re";
		elements[75].symbol = "Os";
		elements[76].symbol = "Ir";
		elements[77].symbol = "Pt";
		elements[78].symbol = "Au";
		elements[79].symbol = "Hg";
		elements[80].symbol = "Tl";
		elements[81].symbol = "Pb";
		elements[82].symbol = "Bi";
		elements[83].symbol = "Po";
		elements[84].symbol = "At";
		elements[85].symbol = "Rn";
		elements[86].symbol = "Fr";
		elements[87].symbol = "Ra";
		elements[88].symbol = "Ac";
		elements[89].symbol = "Th";
		elements[90].symbol = "Pa";
		elements[91].symbol = "U";
		elements[92].symbol = "Np";
		elements[93].symbol = "Pu";
		elements[94].symbol = "Am";
		elements[95].symbol = "Cm";
		elements[96].symbol = "Bk";
		elements[97].symbol = "Cf";
		elements[98].symbol = "Es";
		elements[99].symbol = "Fm";
		elements[100].symbol = "Md";
		elements[101].symbol = "No";
		elements[102].symbol = "Lr";
		elements[103].symbol = "Rf";
		elements[104].symbol = "Db";
		elements[105].symbol = "Sg";
		elements[106].symbol = "Bh";
		elements[107].symbol = "Hs";
		elements[108].symbol = "Mt";
		elements[109].symbol = "Ds";
		elements[110].symbol = "Rg";
		elements[111].symbol = "Cn";
		elements[112].symbol = "Uut";
		elements[113].symbol = "Fl";
		elements[114].symbol = "Uup";
		elements[115].symbol = "Lv";
		elements[116].symbol = "Uus";
		elements[117].symbol = "Uuo";
    //polyatomic ions
    elements[118].symbol = "CH" + "\u2083" + "COO";
    elements[119].symbol = "NH" + "\u2084";
    elements[120].symbol = "C" + "\u2086" + "H" + "\u2085" + "COO";
    elements[121].symbol = "BO" + "\u2083";
    elements[122].symbol = "C" + "\u2082";
    elements[123].symbol = "CO" + "\u2083";
    elements[124].symbol = "HCO" + "\u2083";
    elements[125].symbol = "ClO" + "\u2084";
    elements[126].symbol = "ClO" + "\u2083";
    elements[127].symbol = "ClO" + "\u2082";
    elements[128].symbol = "CLO";
    elements[129].symbol = "CrO" + "\u2084";
    elements[130].symbol = "Cr" + "\u2082" + "O" + "\u2087";
    elements[131].symbol = "CN";
    elements[132].symbol = "OH";
    elements[133].symbol = "IO" + "\u2083";
    elements[134].symbol = "NO" + "\u2083";
    elements[135].symbol = "NO" + "\u2082";
    elements[136].symbol = "OOCCOO";
    elements[137].symbol = "HOOCCOO" ;
    elements[138].symbol = "MnO" + "\u2084";
    elements[139].symbol = "O" + "\u2082";
    elements[140].symbol = "S" + "\u2082";
    elements[141].symbol = "PO" + "\u2084";
    elements[142].symbol = "HPO" + "\u2084";
    elements[143].symbol = "H" + "\u2082" + "PO" + "\u2084";
    elements[144].symbol = "SiO" + "\u2083";
    elements[145].symbol = "SO" + "\u2084";
    elements[146].symbol = "HSO" + "\u2084";
    elements[147].symbol = "SO" + "\u2083";
    elements[148].symbol = "HSO" + "\u2083";
    elements[149].symbol = "HS";
    elements[150].symbol = "SCN";
    elements[151].symbol = "S" + "\u2082" + "O" + "\u2083";
    

		elements[0].metallicProperties = MetallicProperties.METALLIC;
		elements[1].metallicProperties = MetallicProperties.NONMETALLIC;
		elements[2].metallicProperties = MetallicProperties.METALLIC;
		elements[3].metallicProperties = MetallicProperties.METALLIC;
		elements[4].metallicProperties = MetallicProperties.METALLOID;
    elements[119].metallicProperties = MetallicProperties.METALLIC;

		for (i = 5; i < 10; ++i)
			elements[i].metallicProperties = MetallicProperties.NONMETALLIC;

		for (i = 10; i < 13; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLIC;

		elements[13].metallicProperties = MetallicProperties.METALLOID;

		for (i = 14; i < 18; ++i)
			elements[i].metallicProperties = MetallicProperties.NONMETALLIC;

		for (i = 18; i < 31; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLIC;

		elements[31].metallicProperties = MetallicProperties.METALLOID;
		elements[32].metallicProperties = MetallicProperties.METALLOID;

		for (i = 33; i < 36; ++i)
			elements[i].metallicProperties = MetallicProperties.NONMETALLIC;

		for (i = 36; i < 50; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLIC;

		elements[50].metallicProperties = MetallicProperties.METALLOID;
		elements[51].metallicProperties = MetallicProperties.METALLOID;
		elements[52].metallicProperties = MetallicProperties.NONMETALLIC;
		elements[53].metallicProperties = MetallicProperties.NONMETALLIC;

		for (i = 54; i < 83; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLIC;

		elements[83].metallicProperties = MetallicProperties.METALLOID;
		elements[84].metallicProperties = MetallicProperties.NONMETALLIC;
		elements[85].metallicProperties = MetallicProperties.NONMETALLIC;

		for (i = 86; i < 116; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLIC;

		elements[116].metallicProperties = MetallicProperties.NONMETALLIC;
		elements[117].metallicProperties = MetallicProperties.METALLOID;
    elements[118].metallicProperties = MetallicProperties.NONMETALLIC;
    elements[117].metallicProperties = MetallicProperties.METALLIC;

    for(i=120; i < 152; ++i)
      elements[i].metallicProperties = MetallicProperties.NONMETALLIC;

		elements[0].matterState = MatterState.GAS;
		elements[1].matterState = MatterState.GAS;

		for (i = 2; i < 6; ++i)
			elements[i].matterState = MatterState.SOLID;

		for (i = 6; i < 10; ++i)
			elements[i].matterState = MatterState.GAS;

		for (i = 10; i < 16; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[16].matterState = MatterState.GAS;
		elements[17].matterState = MatterState.GAS;

		for (i = 18; i < 34; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[34].matterState = MatterState.LIQUID;
		elements[35].matterState = MatterState.GAS;

		for (i = 36; i < 43; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[44].matterState = MatterState.SYNTHETIC;

		for (i = 45; i < 52; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[53].matterState = MatterState.GAS;

		for (i = 54; i < 78; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[79].matterState = MatterState.LIQUID;

		for (i = 80; i < 84; ++i)
			elements[i].matterState = MatterState.SOLID;

		elements[85].matterState = MatterState.GAS;

		for (i = 86; i < 91; ++i)
			elements[i].matterState = MatterState.SOLID;

		for (i = 92; i < 117; ++i)
			elements[i].matterState = MatterState.SYNTHETIC;

    for (i = 103; i <= 117; ++i)
			elements[i].metallicProperties = MetallicProperties.METALLOID;

    for (i = 118; i < 152; ++i)
			elements[i].matterState = MatterState.POLYATOMIC;

    elements[1].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    elements[9].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    elements[17].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    elements[35].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    elements[53].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    elements[85].metallicProperties = MetallicProperties.NOT_APPLICABLE;
    

		elements[0].atomicMass = 1.01;
		elements[1].atomicMass = 4.00;
		elements[2].atomicMass = 6.94;
		elements[3].atomicMass = 9.01;
		elements[4].atomicMass = 10.81;
		elements[5].atomicMass = 12.01;
		elements[6].atomicMass = 14.01;
		elements[7].atomicMass = 16.00;
		elements[8].atomicMass = 19.00;
		elements[9].atomicMass = 20.18;
		elements[10].atomicMass = 22.99;
		elements[11].atomicMass = 24.31;
		elements[12].atomicMass = 26.98;
		elements[13].atomicMass = 28.09;
		elements[14].atomicMass = 30.97;
		elements[15].atomicMass = 32.07;
		elements[16].atomicMass = 35.45;
		elements[17].atomicMass = 39.95;
		elements[18].atomicMass = 39.10;
		elements[19].atomicMass = 40.08;
		elements[20].atomicMass = 44.96;
		elements[21].atomicMass = 47.87;
		elements[22].atomicMass = 50.94;
		elements[23].atomicMass = 52.00;
		elements[24].atomicMass = 54.94;
		elements[25].atomicMass = 55.85;
		elements[26].atomicMass = 58.93;
		elements[27].atomicMass = 58.69;
		elements[28].atomicMass = 63.55;
		elements[29].atomicMass = 65.39;
		elements[30].atomicMass = 69.72;
		elements[31].atomicMass = 72.64;
		elements[32].atomicMass = 74.92;
		elements[33].atomicMass = 78.96;
		elements[34].atomicMass = 79.90;
		elements[35].atomicMass = 83.80;
		elements[36].atomicMass = 85.47;
		elements[37].atomicMass = 87.62;
		elements[38].atomicMass = 88.91;
		elements[39].atomicMass = 91.22;
		elements[40].atomicMass = 92.91;
		elements[41].atomicMass = 95.94;
		elements[42].atomicMass = 98;
		elements[43].atomicMass = 101.07;
		elements[44].atomicMass = 102.91;
		elements[45].atomicMass = 106.42;
		elements[46].atomicMass = 107.87;
		elements[47].atomicMass = 112.41;
		elements[48].atomicMass = 114.82;
		elements[49].atomicMass = 118.71;
		elements[50].atomicMass = 121.76;
		elements[51].atomicMass = 127.6;
		elements[52].atomicMass = 126.90;
		elements[53].atomicMass = 131.29;
		elements[54].atomicMass = 132.91;
		elements[55].atomicMass = 137.33;
		elements[56].atomicMass = 138.91;
		elements[57].atomicMass = 140.12;
		elements[58].atomicMass = 140.91;
		elements[59].atomicMass = 144.24;
		elements[60].atomicMass = 145;
		elements[61].atomicMass = 150.36;
		elements[62].atomicMass = 151.96;
		elements[63].atomicMass = 157.25;
		elements[64].atomicMass = 158.93;
		elements[65].atomicMass = 162.5;
		elements[66].atomicMass = 164.93;
		elements[67].atomicMass = 167.26;
		elements[68].atomicMass = 168.93;
		elements[69].atomicMass = 173.04;
		elements[70].atomicMass = 174.97;
		elements[71].atomicMass = 178.49;
		elements[72].atomicMass = 180.95;
		elements[73].atomicMass = 183.84;
		elements[74].atomicMass = 186.21;
		elements[75].atomicMass = 190.23;
		elements[76].atomicMass = 192.22;
		elements[77].atomicMass = 195.08;
		elements[78].atomicMass = 196.97;
		elements[79].atomicMass = 200.59;
		elements[80].atomicMass = 204.38;
		elements[81].atomicMass = 207.21;
		elements[82].atomicMass = 208.98;
		elements[83].atomicMass = 209;
		elements[84].atomicMass = 210;
		elements[85].atomicMass = 222;
		elements[86].atomicMass = 223;
		elements[87].atomicMass = 226;
		elements[88].atomicMass = 227;
		elements[89].atomicMass = 232.04;
		elements[90].atomicMass = 231.04;
		elements[91].atomicMass = 238.03;
		elements[92].atomicMass = 237;
		elements[93].atomicMass = 244;
		elements[94].atomicMass = 243;
		elements[95].atomicMass = 247;
		elements[96].atomicMass = 247;
		elements[97].atomicMass = 251;
		elements[98].atomicMass = 252;
		elements[99].atomicMass = 257;
		elements[100].atomicMass = 258;
		elements[101].atomicMass = 259;
		elements[102].atomicMass = 262;
		elements[103].atomicMass = 261;
		elements[104].atomicMass = 262;
		elements[105].atomicMass = 266;
		elements[106].atomicMass = 264;
		elements[107].atomicMass = 277;
		elements[108].atomicMass = 268;
		elements[109].atomicMass = 281;
		elements[110].atomicMass = 272;
		elements[111].atomicMass = 285;
		elements[112].atomicMass = 289;
		elements[113].atomicMass = 289;
		elements[114].atomicMass = 288;
		elements[115].atomicMass = 293;
		elements[116].atomicMass = 294;
		elements[117].atomicMass = 294;
    //polyatomic masses
    elements[118].atomicMass = 59.05;
    elements[119].atomicMass = 18.05;
    elements[120].atomicMass = 121.12;
    elements[121].atomicMass = 58.81;
    elements[122].atomicMass = 24.02;
    elements[123].atomicMass = 60.01;
    elements[124].atomicMass = 61.02;
    elements[125].atomicMass = 99.45;
    elements[126].atomicMass = 83.45;
    elements[127].atomicMass = 67.45;
    elements[128].atomicMass = 51.45;
    elements[129].atomicMass = 116;
    elements[130].atomicMass = 216;
    elements[131].atomicMass = 26.02;
    elements[132].atomicMass = 17.01;
    elements[133].atomicMass = 174.9;
    elements[134].atomicMass = 62.01;
    elements[135].atomicMass = 46.01;
    elements[136].atomicMass = 88.02;
    elements[137].atomicMass = 89.03;
    elements[138].atomicMass = 118.94;
    elements[139].atomicMass = 32;
    elements[140].atomicMass = 64.14;
    elements[141].atomicMass = 94.97;
    elements[142].atomicMass = 95.98;
    elements[143].atomicMass = 96.99;
    elements[144].atomicMass = 76.09;
    elements[145].atomicMass = 96.07;
    elements[146].atomicMass = 97.08;
    elements[147].atomicMass = 80.07;
    elements[148].atomicMass = 81.08;
    elements[149].atomicMass = 33.08;
    elements[150].atomicMass = 58.09;
    elements[151].atomicMass = 112.14;

    elements[0].atomicCharge = 1;
		elements[1].atomicCharge = 0;
		elements[2].atomicCharge = 1;
		elements[3].atomicCharge = 2;
		elements[4].atomicCharge = -5;
		elements[5].atomicCharge = -4;
		elements[6].atomicCharge = -3;
		elements[7].atomicCharge = -2;
		elements[8].atomicCharge = -1;
		elements[9].atomicCharge = 0;
		elements[10].atomicCharge = 1;
		elements[11].atomicCharge = 2;
		elements[12].atomicCharge = 3;
		elements[13].atomicCharge = -4;
		elements[14].atomicCharge = -3;
		elements[15].atomicCharge = -2;
		elements[16].atomicCharge = -1;
		elements[17].atomicCharge = 0;
		elements[18].atomicCharge = 1;
		elements[19].atomicCharge = 2;
		elements[20].atomicCharge = 3;
		elements[21].atomicCharge = 4;
		elements[22].atomicCharge = 5;
		elements[23].atomicCharge = 3;
		elements[24].atomicCharge = 2;
		elements[25].atomicCharge = 3;
		elements[26].atomicCharge = 2;
		elements[27].atomicCharge = 2;
		elements[28].atomicCharge = 2;
		elements[29].atomicCharge = 2;
		elements[30].atomicCharge = 3;
		elements[31].atomicCharge = 4;
		elements[32].atomicCharge = -3;
		elements[33].atomicCharge = -2;
		elements[34].atomicCharge = -1;
		elements[35].atomicCharge = 0;
		elements[36].atomicCharge = 1;
		elements[37].atomicCharge = 2;
		elements[38].atomicCharge = 3;
		elements[39].atomicCharge = 4;
		elements[40].atomicCharge = 5;
		elements[41].atomicCharge = 6;
		elements[42].atomicCharge = 7;
		elements[43].atomicCharge = 3;
		elements[44].atomicCharge = 3;
		elements[45].atomicCharge = 2;
		elements[46].atomicCharge = 1;
		elements[47].atomicCharge = 2;
		elements[48].atomicCharge = 3;
		elements[49].atomicCharge = 4;
		elements[50].atomicCharge = 3;
		elements[51].atomicCharge = -2;
		elements[52].atomicCharge = -1;
		elements[53].atomicCharge = 0;
		elements[54].atomicCharge = 1;
		elements[55].atomicCharge = 2;
		elements[56].atomicCharge = 3;
		elements[57].atomicCharge = 3;
		elements[58].atomicCharge = 3;
		elements[59].atomicCharge = 3;
		elements[60].atomicCharge = 3;
		elements[61].atomicCharge = 3;
		elements[62].atomicCharge = 3;
		elements[63].atomicCharge = 3;
		elements[64].atomicCharge = 3;
		elements[65].atomicCharge = 3;
		elements[66].atomicCharge = 3;
		elements[67].atomicCharge = 3;
		elements[68].atomicCharge = 3;
		elements[69].atomicCharge = 3;
		elements[70].atomicCharge = 2;
		elements[71].atomicCharge = 4;
		elements[72].atomicCharge = 5;
		elements[73].atomicCharge = 6;
		elements[74].atomicCharge = 7;
		elements[75].atomicCharge = 4;
		elements[76].atomicCharge = 4;
		elements[77].atomicCharge = 4;
		elements[78].atomicCharge = 3;
		elements[79].atomicCharge = 2;
		elements[80].atomicCharge = 1;
		elements[81].atomicCharge = 2;
		elements[82].atomicCharge = 3;
		elements[83].atomicCharge = 4;
		elements[84].atomicCharge = -1;
		elements[85].atomicCharge = 0;
		elements[86].atomicCharge = 1;
		elements[87].atomicCharge = 2;
		elements[88].atomicCharge = 3;
		elements[89].atomicCharge = 4;
		elements[90].atomicCharge = 5;
		elements[91].atomicCharge = 6;
		elements[92].atomicCharge = 5;
		elements[93].atomicCharge = 4;
		elements[94].atomicCharge = 3;
		elements[95].atomicCharge = 3;
		elements[96].atomicCharge = 3;
		elements[97].atomicCharge = 3;
		elements[98].atomicCharge = 3;
		elements[99].atomicCharge = 3;
		elements[100].atomicCharge = 2;
		elements[101].atomicCharge = 2;
		elements[102].atomicCharge = 3;
    //polyatomic ions
    elements[118].atomicCharge = -1;
    elements[119].atomicCharge = 1;
    elements[120].atomicCharge = -1;
    elements[121].atomicCharge = -3;
    elements[122].atomicCharge = -2;
    elements[123].atomicCharge = -2;
    elements[124].atomicCharge = -1;
    elements[125].atomicCharge = -1;
    elements[126].atomicCharge = -1;
    elements[127].atomicCharge = -1;
    elements[128].atomicCharge = -1;
    elements[129].atomicCharge = -2;
    elements[130].atomicCharge = -2;
    elements[131].atomicCharge = -1;
    elements[132].atomicCharge = -1;
    elements[133].atomicCharge = -1;
    elements[134].atomicCharge = -1;
    elements[135].atomicCharge = -1;
    elements[136].atomicCharge = -2;
    elements[137].atomicCharge = -1;
    elements[138].atomicCharge = -1;
    elements[139].atomicCharge = -2;
    elements[140].atomicCharge = -2;
    elements[141].atomicCharge = -3;
    elements[142].atomicCharge = -2;
    elements[143].atomicCharge = -1;
    elements[144].atomicCharge = -2;
    elements[145].atomicCharge = -2;
    elements[146].atomicCharge = -1;
    elements[147].atomicCharge = -2;
    elements[148].atomicCharge = -1;
    elements[149].atomicCharge = -1;
    elements[150].atomicCharge = -1;
    elements[151].atomicCharge = -2;


	}

	public static Element lookupElement(String property, String propertyType) {
		if (property == null || property.trim().length() == 0 || propertyType == null)
			return emptyElement;
		property = property.trim();
		if (propertyType.equals("Atomic #"))
			try {
				int atomicNumber = Integer.parseInt(property);
				if (atomicNumber < 1 || atomicNumber > TOTAL_ELEMENTS)
					return emptyElement;
				return elements[atomicNumber - 1];
			} catch (NumberFormatException ignored) {

			}

		for (Element element : elements)
			if (element.name.equalsIgnoreCase(property) && propertyType.equals("Name"))
				return element;
			else if (element.symbol.equalsIgnoreCase(property) && propertyType.equals("Symbol"))
				return element;
		if (propertyType.equals("Name")) {
			int smallestDistance = Integer.MAX_VALUE;
			Element closestElement = emptyElement;
			for (Element element : elements) {
				int distance = levenshteinDistance(element.name, property);
				if (distance < smallestDistance) {
					closestElement = element;
					smallestDistance = distance;
				}
			}
			return closestElement;
		}
		return emptyElement;
	}

	private static int levenshteinDistance(String string1, String string2) {
		if (string1 == null || string2 == null)
			return Integer.MAX_VALUE;
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		int[] costs = new int[string2.length() + 1];
		for (int j = 0; j < costs.length; j++)
			costs[j] = j;
		for (int i = 1; i <= string1.length(); i++) {
			costs[0] = i;
			int nw = i - 1;
			for (int j = 1; j <= string2.length(); j++) {
				int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), string1.charAt(i - 1) == string2.charAt(j - 1) ? nw : nw + 1);
				nw = costs[j];
				costs[j] = cj;
			}
		}
		return costs[string2.length()];
	}

	private static String getRealName(Enum e) {
		if (e.name().equals("NOT_APPLICABLE"))
			return "N/A";
		String name = e.name();
		return name.charAt(0) + name.substring(1, name.length()).toLowerCase().replaceAll("_", "-");
	}

	public enum MetallicProperties {
		NONMETALLIC,
		METALLOID,
		METALLIC,
		NOT_APPLICABLE;

		public String toString() {
			return getRealName(this);
		}
	}

	public enum MatterState {
		SOLID,
		LIQUID,
		GAS,
		SYNTHETIC,
    POLYATOMIC,
		NOT_APPLICABLE;

		public String toString() {
			return getRealName(this);
		}
    
	}
  
	public static class Element {
		public int atomicNumber = 0;
    public int atomicCharge = 0;
		public String name = "N/A";
		public String symbol = "N/A";
		public MetallicProperties metallicProperties = MetallicProperties.NOT_APPLICABLE;
		public MatterState matterState = MatterState.NOT_APPLICABLE;
		public double atomicMass = 0;
    public String state()
    {
      return matterState.toString();
    }
    public String metallic()
    {
      return metallicProperties.toString();
    }
	}
}
